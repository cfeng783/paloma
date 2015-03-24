package quanticol.ed.ac.uk.paloma.model;

import java.util.HashMap;

public class StateManager {
	HashMap<String, State> stateMap = new HashMap<String, State>();
	
	public void putState(State s) {
		if(stateMap.get(s.getID()) == null) {
			stateMap.put(s.getID(),s);
			//System.out.println(s.print());
		}else {
			System.err.println("error, multiple definition of State "+ s.getID());
		}
	}
	
	public State getState(String stateID) {
		return stateMap.get(stateID);
	}
	
	public HashMap<String, State> getStateMap() {
		return this.stateMap;
	}
	
	public void clear() {
		this.stateMap.clear();
	}
}
