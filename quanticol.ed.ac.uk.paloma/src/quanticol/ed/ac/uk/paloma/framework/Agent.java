package quanticol.ed.ac.uk.paloma.framework;

import java.util.ArrayList;
import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.model.ExpEvaluator;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.model.action.Action;
import quanticol.ed.ac.uk.paloma.model.action.InBrAction;
import quanticol.ed.ac.uk.paloma.model.action.InUnAction;
import quanticol.ed.ac.uk.paloma.model.action.PropensityFunc;
import quanticol.ed.ac.uk.paloma.model.action.SpBrAction;
import quanticol.ed.ac.uk.paloma.model.action.SpNoMsgAction;
import quanticol.ed.ac.uk.paloma.model.action.SpUnAction;
import quanticol.ed.ac.uk.paloma.utality.Utality;

public class Agent{
	String stateID;
	ArrayList<Action> IndActions;
	ArrayList<PropensityFunc> propensityFuncs;
	int count;
	
	public Agent(String StateID, int count) {
		this.stateID = StateID;
		this.count = count;
		IndActions = new ArrayList<Action>();
		propensityFuncs = new ArrayList<PropensityFunc>();
		State state = GlobalManager.getStateManager().getState(stateID);
		if(state == null) {
			return;
		}
		for(Action ac: state.getActionList()) {
			if(ac.getType() == Action.ACTION_TYPE_SpBr) {
				SpBrAction spBrAc = (SpBrAction) ac;
				PropensityFunc pf = new PropensityFunc(stateID, ac, spBrAc.getRate());
				propensityFuncs.add(pf);
			}else if(ac.getType() == Action.ACTION_TYPE_SpNoMsg) {
				SpNoMsgAction spNoMsgAc = (SpNoMsgAction) ac;
				PropensityFunc pf = new PropensityFunc(stateID, ac, spNoMsgAc.getRate());
				propensityFuncs.add(pf);
			}else if(ac.getType() == Action.ACTION_TYPE_SpUn) {
				SpUnAction spUnAc = (SpUnAction) ac;
                ArrayList<String> pontentialReceivers = new ArrayList<String>();
                for(String stateKey: GlobalManager.getStateManager().getStateMap().keySet()) {
                    State receiverState = GlobalManager.getStateManager().getStateMap().get(stateKey);
                    for(Action reaction: receiverState.getActionList()) {
                        if(reaction.getType() == Action.ACTION_TYPE_InUn && reaction.getName().equals(ac.getName())) {
                            pontentialReceivers.add(stateKey);
                        }
                    }
                }
                
                PropensityFunc pf = new PropensityFunc(stateID, ac, spUnAc.getRate());
                
                pf.setPotentialReceivers(pontentialReceivers);
                propensityFuncs.add(pf);
			}else {
				IndActions.add(ac);
			}
		}
	}
	
	public void handleBrMsg(String msgName, Loc senderLoc){
		if(count==0) {
			return;
		}
		State state = GlobalManager.getStateManager().getState(stateID);
		for(Action action : IndActions) {
			if(action.getType() == Action.ACTION_TYPE_InBr) {
				InBrAction inBrA = (InBrAction) action;
				if(inBrA.getName().equals(msgName)) {
					double receptPr = ExpEvaluator.evalProExp(inBrA.getPrExp(), senderLoc, state.getLocation());
					double acceptPr = inBrA.getAcceptPr();
					
					int inducedCount = 0;
					for(int i=0; i<count; i++) {
						double r = Utality.getRandom().nextDouble();
						if(r <= acceptPr*receptPr) {
							inducedCount++;
						}
					}
					
					this.count -= inducedCount;
					Agent e = GlobalManager.getAgentList().get(action.getNextState());
					e.addCount(inducedCount);
				}
			}
		}
	}
	
	public void handleUniMsg(String msgName) {
		if(count==0) {
			return;
		}
		State state = GlobalManager.getStateManager().getState(stateID);
		for(Action action: state.getActionList()) {
			if(action.getType() == Action.ACTION_TYPE_InUn) {
				InUnAction inUni = (InUnAction) action;
				if(inUni.getName().equals(msgName)) {
					if(Utality.getRandom().nextDouble() <= inUni.getAcceptPr()) {
						this.count--;
						Agent e = GlobalManager.getAgentList().get(action.getNextState());
						e.addCount(1);
					}
				}
			}
		}	
	}
	
	public void fireAction(Action action) {
		if(action.getType() == Action.ACTION_TYPE_SpBr) {
			SpBrAction spBr = (SpBrAction) action;
			State curState = GlobalManager.getStateManager().getState(stateID);
			//this piece of code should be optimised in the future
			HashMap<String, Loc> BroadcastRange = GlobalManager.getLocationManager().evalMsgRange(curState.getLocation(), spBr.getRangeExp());
			RuntimeMsg realMsg = new RuntimeMsg(spBr.getName(), curState.getLocation(), RuntimeMsg.TYPE_Br, BroadcastRange);
			GlobalManager.dispatchMsg(realMsg);
		} else if(action.getType() == Action.ACTION_TYPE_SpUn) {
			SpUnAction spUn = (SpUnAction) action;
			State curState = GlobalManager.getStateManager().getState(stateID);
			//this piece of code should be optimised in the future
			HashMap<String, Loc> UnicastRange = GlobalManager.getLocationManager().evalMsgRange(curState.getLocation(), spUn.getRangeExp());
			RuntimeMsg realMsg = new RuntimeMsg(spUn.getName(), curState.getLocation(), RuntimeMsg.TYPE_Un, UnicastRange);
			//System.out.println("send out " + realMsg.getName());
			GlobalManager.dispatchMsg(realMsg);
		}
		
		this.count--;
		Agent e = GlobalManager.getAgentList().get(action.getNextState());
		e.addCount(1);		
	}
	
	ArrayList<PropensityFunc> getPropensityFunctions() {
		//System.out.println(curStateID);
        if(this.count == 0 || propensityFuncs.size()==0) {
        	return null;
        }
		for(PropensityFunc pf: propensityFuncs) {
			pf.setRate(pf.getInternalRate() * count);
		}
		return propensityFuncs;
    }
	
	void display(Simulator simulator) {
		GlobalManager.getCounter().record(simulator.now());
        //System.out.print("t= " + simulator.now());
        /*for (Agent e : GlobalManager.getCellManager().getCell(cellKey).getAgentList()) {
          System.out.print(" " + e.curState + " ");
        }*/
        //System.out.println("");
    }
	
	public String getStateID() {
		return this.stateID;
	}
	
	public int getCount() {
		return this.count;
	}
	
	public void addCount(int adder) {
		count = count + adder;
	}
}
