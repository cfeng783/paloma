package quanticol.ed.ac.uk.paloma.framework;

import java.util.ArrayList;

import quanticol.ed.ac.uk.paloma.utality.Utality;
import quanticol.ed.ac.uk.paloma.model.action.PropensityFunc;


/**
 * defines the SSA
 */
public class StochasticEvent extends Event{
	ArrayList<PropensityFunc> pfArray = new ArrayList<PropensityFunc>();
	int chosenIndex;
	
	@Override
	void execute(AbstractSimulator simulator) {
		PropensityFunc chosenPf = pfArray.get(chosenIndex);
		Agent agent = GlobalManager.getAgentList().get(chosenPf.getStateID());
		agent.fireAction(chosenPf.getAction());
		Simulator sim = (Simulator)simulator;
		GlobalManager.getCounter().record(sim.now());
		pfArray.clear();
		for(String key: GlobalManager.getAgentList().keySet()) {
			Agent e = GlobalManager.getAgentList().get(key);
			if(e.getPropensityFunctions() != null && e.getPropensityFunctions().size()>0) {
				pfArray.addAll(e.getPropensityFunctions());
			}
		}
		scheduleNextEvent(sim);
	}
	
	public void initPropensityFuncArray() {
		for(String key: GlobalManager.getAgentList().keySet()) {
			Agent e = GlobalManager.getAgentList().get(key);
			if(e.getPropensityFunctions() != null && e.getPropensityFunctions().size()>0) {
				pfArray.addAll(e.getPropensityFunctions());
			}
		}
	}
	
	public void scheduleNextEvent(Simulator simulator) {
		double r1 = Utality.getRandom().nextDouble();
		double r2 = Utality.getRandom().nextDouble();
		
		double totalRate = 0;
		for(int i=0; i<pfArray.size(); i++) {
			PropensityFunc pf = pfArray.get(i);
			totalRate += pf.getApparentRate();
		}
		if(totalRate <= 0) {
			return;
		}
		
		double curTotal = 0;
		for(int i=0; i<pfArray.size(); i++) {
			PropensityFunc pf = pfArray.get(i);
			curTotal += pf.getApparentRate();
			if(r2 >= (curTotal-pf.getApparentRate())/totalRate && r2 < curTotal/totalRate) {
				chosenIndex = i;
			}
		}
		
		double deltaT = 1/totalRate * Math.log(1/r1);
		time = simulator.now() + deltaT;
		simulator.insert(this);
	}

}
