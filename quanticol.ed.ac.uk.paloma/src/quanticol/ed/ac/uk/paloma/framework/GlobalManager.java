package quanticol.ed.ac.uk.paloma.framework;

import java.util.ArrayList;
import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.utality.Utality;
import quanticol.ed.ac.uk.paloma.model.ExpEvaluator;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.LocManager;
import quanticol.ed.ac.uk.paloma.model.ParamManager;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.model.StateManager;
import quanticol.ed.ac.uk.paloma.model.action.Action;
import quanticol.ed.ac.uk.paloma. model.action.InUnAction;
import quanticol.ed.ac.uk.paloma.facility.PlotVarDefiner;

public class GlobalManager {
	static StateManager stateManager;
	static LocManager locationManager;
	static ParamManager paramManager;
	
	static HashMap<String, Agent> agentList;
	static ArrayList<Agent> initialAgentList;
	static Counter counter;
	static PlotVarDefiner pVD;
	
	static HashMap<String, Integer> orphanStates;
	
	public static void init(){
		if(stateManager == null) {
			Utality.init();
			stateManager = new StateManager();
			locationManager = new LocManager();
			paramManager = new ParamManager();
			agentList = new HashMap<String, Agent>();
			initialAgentList = new ArrayList<Agent>();
			counter = new Counter();
			pVD = new PlotVarDefiner();
			orphanStates = new HashMap<String,Integer>();
		}	
	}
	
	public static void initializeCounter(double finaltime, int runs) {
		counter.setUp(runs, finaltime);
		//counter.setPlotVars(plotVars);
		counter.setupStateIndexMap(stateManager.getStateMap());
	}
	
	public static void preRun(int curRun) {
		agentList.clear();
		for(Agent agent: initialAgentList) {
			Agent e = new Agent(agent.getStateID(), agent.getCount());
			agentList.put(e.getStateID(), e);
		}
		counter.preRun(curRun);
	}
	
	public static Counter getCounter() {
		return counter;
	}
	
	public static HashMap<String, Agent> getAgentList() {
		return	agentList;
	}
	
	public static StateManager getStateManager() {
		return stateManager;
	}
	
	public static LocManager getLocationManager() {
		return locationManager;
	}
	
	public static ParamManager getParamManager() {
		return paramManager;
	}
	
	public static PlotVarDefiner getPlotVarDefiner() {
		return pVD;
	}
	
	public static void addAgent(Agent e){
		initialAgentList.add(e);
	}
	
	public static ArrayList<Agent> getInitAgentList() {
		return initialAgentList;
	}
	
	public static HashMap<String, Integer> getOrphanMap() {
		return orphanStates;
	}
	
	public static void dispatchMsg(RuntimeMsg realMsg) {	
		//counter.record(simulator.now());
		if(realMsg.getType() == RuntimeMsg.TYPE_Br) {
			HashMap<String, Loc> rangeMap = realMsg.getRange();
			for(String key: agentList.keySet()) {
				Agent e = agentList.get(key);
				State state = stateManager.getState(e.getStateID());
				Loc loc = state.getLocation();
				if(rangeMap.get(loc.getKey()) != null) { //check if the agent is within the broadcast range
					e.handleBrMsg(realMsg.getName(), realMsg.getSenderLoc());
				}
	    	}
		}else if (realMsg.getType() == RuntimeMsg.TYPE_Un) {
			//to test this piece of code!
			double priSum = 0; // the sum of priority
			ArrayList<Agent> potentialReceiverList = new ArrayList<Agent>();
			ArrayList<Double> priList = new ArrayList<Double>();
			HashMap<String, Loc> rangeMap = realMsg.getRange();
			for(String key: agentList.keySet()) {
				Agent e = agentList.get(key);
				State state = stateManager.getState(e.getStateID());
				Loc loc = state.getLocation();
				if(rangeMap.get(loc.getKey()) != null) { //check if the agent is within the unicast range
					for(Action action: state.getActionList()) {
						if(action.getType() == Action.ACTION_TYPE_InUn) {
							InUnAction inUni = (InUnAction) action;
							if(inUni.getName().equals(realMsg.getName())) {
								double pri = ExpEvaluator.evalWtExp(inUni.getWtExp(), 
										realMsg.getSenderLoc(), loc);
								priSum += pri*e.getCount();
								potentialReceiverList.add(e);
								priList.add(priSum);
								break;
							}
						}
					}
				}
	    	}
			double rnd = Utality.getRandom().nextDouble()*priSum;
			int hitIndex = -1;
			for(int i=0; i<priList.size(); i++) {
				if(priList.get(i)>rnd) {
					hitIndex = i;
					break;
					//System.out.println("hitIndex: " + hitIndex);
				}
			}
			if(hitIndex != -1) {
				Agent receiverAgent = potentialReceiverList.get(hitIndex);
				receiverAgent.handleUniMsg(realMsg.getName());
			}
			
			
		}
	}
	
	public static void clear() {
		stateManager.clear();
		locationManager.clear();
		paramManager.clear();
		agentList.clear();
		initialAgentList.clear();
	}
	
	public static void clearCounter() {
		counter.clear();
	}
	
	public static void clearPlotVars() {
		pVD.clear();
	}
	
}
