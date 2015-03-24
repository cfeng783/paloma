package quanticol.ed.ac.uk.paloma.odedecompose;

import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.model.action.Action;
import quanticol.ed.ac.uk.paloma.model.action.SpBrAction;
import quanticol.ed.ac.uk.paloma.model.action.SpUnAction;

public class Decomposer {
	public final static int ONE_HOP_NEIGHBOR = 1;
	public final static int TWO_HOP_NEIGHBOR = 2;
	public final static int THREE_HOP_NEIGHBOR = 3;
	public final static int NONE_NEIGHBOR = 4;
	
	public static int checkCorrelation(State st1, State st2, HashMap<String, State> stateMap, int depth) {
		if(depth==4) {
			return depth;
		}
		
		for(Action action1: st1.getActionList()) {
			if(action1.getType() == Action.ACTION_TYPE_SpBr) {
				for(Action action2: st2.getActionList()) {
					if(action2.getType() == Action.ACTION_TYPE_InBr && action2.getName().equals(action1.getName())) {
						SpBrAction senderSpBrA = (SpBrAction) action1;
						HashMap<String, Loc> BrRange = GlobalManager.getLocationManager().evalMsgRange(st1.getLocation(), senderSpBrA.getRangeExp());
						if(BrRange.get(st2.getLocation().getKey()) != null) {
							return depth;
						}
					}
				}
			}else if(action1.getType() == Action.ACTION_TYPE_SpUn) {
				for(Action action2: st2.getActionList()) {
					if(action2.getType() == Action.ACTION_TYPE_InUn && action2.getName().equals(action1.getName())) {
						SpUnAction senderSpUnA = (SpUnAction) action1;
						HashMap<String, Loc> BrRange = GlobalManager.getLocationManager().evalMsgRange(st1.getLocation(), senderSpUnA.getRangeExp());
						if(BrRange.get(st2.getLocation().getKey()) != null) {
							return depth;
						}
					}
				}
			}else if(action1.getType()==Action.ACTION_TYPE_InBr) {
				for(Action action2: st2.getActionList()) {
					if(action2.getType() == Action.ACTION_TYPE_SpBr && action2.getName().equals(action1.getName())) {
						SpBrAction senderSpBrA = (SpBrAction) action2;
						HashMap<String, Loc> BrRange = GlobalManager.getLocationManager().evalMsgRange(st2.getLocation(), senderSpBrA.getRangeExp());
						if(BrRange.get(st1.getLocation().getKey()) != null) {
							return depth;
						}
					}
				}
			}else if(action1.getType() == Action.ACTION_TYPE_InUn) {
				for(Action action2: st2.getActionList()) {
					if(action2.getType() == Action.ACTION_TYPE_SpUn && action2.getName().equals(action1.getName())) {
						SpUnAction senderSpUnA = (SpUnAction) action2;
						HashMap<String, Loc> BrRange = GlobalManager.getLocationManager().evalMsgRange(st2.getLocation(), senderSpUnA.getRangeExp());
						if(BrRange.get(st1.getLocation().getKey()) != null) {
							return depth;
						}
					}
				}
			}
		}
		
		int[] depths = new int[st1.getActionList().size()];
		for(int i=0; i<st1.getActionList().size(); i++) {
			Action act1 = st1.getActionList().get(i);
			String nextStateID = act1.getNextState();
			if(nextStateID.equals(st2.getID())) {
				return depth;
			}else {
				State nextState = stateMap.get(nextStateID);
				depths[i] = checkCorrelation(nextState, st2, stateMap, depth+1);
			}
		}
		int min = 1000;
		for(int i=0; i<depths.length; i++) {
			if(depths[i] < min) {
				min = depths[i];
			}
		}
		return min;
		
	}
	
}
