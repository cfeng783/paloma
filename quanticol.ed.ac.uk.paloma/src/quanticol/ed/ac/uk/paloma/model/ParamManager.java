package quanticol.ed.ac.uk.paloma.model;

import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.utality.Utality;

public class ParamManager {
	HashMap<String, Double> paramMap = new HashMap<String, Double>();
	
	public void addParam(String name, double value) {
		if(isParamExist(name)) {
			System.err.println("param " + name + " already exists!");
		}else {
			paramMap.put(name, value);
			Utality.setParamInInterpreter(name, value);
			//System.out.println("param " + name + ": " + value);
		}
	}
	
	public boolean isParamExist(String name) {
		if(paramMap.get(name) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public double getParamValue(String name) {
		double ret = (Double) paramMap.get(name);
		return ret;
	}
	
	public HashMap<String, Double> getParamMap() {
		return this.paramMap;
	}
	
	public void clear() {
		paramMap.clear();
	}
}
