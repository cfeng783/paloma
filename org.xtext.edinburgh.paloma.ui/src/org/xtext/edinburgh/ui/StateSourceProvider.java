package org.xtext.edinburgh.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.ui.AbstractSourceProvider;
import org.eclipse.ui.ISources;

public class StateSourceProvider extends AbstractSourceProvider {

	public final static String MY_STATE = "org.xtext.edinburgh.paloma.ui.currentState";
	public final static String PARSED = "PARSED";
	public final static String UNPARSED = "UNPARSED";
	public final static String SIMULATED = "SIMULATED";
	public final static String SIMULATING = "SIMULATING";
	private String curState = UNPARSED;
	  
	public StateSourceProvider() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Map getCurrentState() {
		Map map = new HashMap(1);
	    map.put(MY_STATE, curState);
	    return map;
	}

	@Override
	public String[] getProvidedSourceNames() {
		return new String[] { MY_STATE };
	}
	
	 public void setState(String state) {
		curState = state;
	    fireSourceChanged(ISources.WORKBENCH, MY_STATE, state);
	 }

}
