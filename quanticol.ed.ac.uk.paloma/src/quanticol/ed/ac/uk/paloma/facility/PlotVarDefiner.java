package quanticol.ed.ac.uk.paloma.facility;

import java.util.ArrayList;

public class PlotVarDefiner {
	private ArrayList<String> plotVars = new ArrayList<String>();
	
	
	public void insertPlotVars(ArrayList<String> vars) {
		for(String var: vars) {
			plotVars.add(var);
		}
	}
	
	public void insertPlotVars(String[] vars) {
		for(int i=0; i<vars.length; i++) {
			plotVars.add(vars[i]);
		}
	}
	
	public ArrayList<String> getPlotVars(){
		return this.plotVars;
	}
	
	public String[] getPlots(){
		String plots[] = new String[plotVars.size()];
		for(int i=0; i<plotVars.size(); i++) {
			plots[i] = plotVars.get(i);
		}
		return plots;
	}
	
	public void clear() {
		this.plotVars.clear();
	}
}
