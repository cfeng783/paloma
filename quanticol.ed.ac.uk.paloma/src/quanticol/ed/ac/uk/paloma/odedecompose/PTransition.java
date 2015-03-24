package quanticol.ed.ac.uk.paloma.odedecompose;

import java.util.ArrayList;
import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.model.ConstExp;

public class PTransition {
	private String constFactor; //constant factors in rate expr
	private ArrayList<MomentItem> momentFactors = new ArrayList<MomentItem>(); //moment factor(state population variables) in rate
	
	private String prevSt;
	private String nextSt;
	
	
	public PTransition(String prevSt, String nextSt, String constFactor) {
		this.constFactor = constFactor;
		this.prevSt = prevSt;
		this.nextSt = nextSt;
	}
	
	@Override
	public String toString() {
		String ret = this.prevSt + " to " + this.nextSt + " : const factor-- " + this.constFactor;
		return ret;
	}
	
	public String makeMeanFieldApproximation(String state, HashMap<String, Integer> indexMap) {
		String ret = "";
		if(state.equals(prevSt)) {
			ret += "-" + constFactor;
		}else if(state.equals(nextSt)) {
			ret += "+" + constFactor;	
		}else {
			return ret;
		}
		for(MomentItem mf: momentFactors){
			if(mf.getOrder() == 1) {
				ret += "*y(" + indexMap.get(mf.getState()) + ")";
			}else {
				System.err.println("ode error");
				// no possibility to beyond 1
			}
		}
		return ret;
	}
	
	public String makeFirstMoment(String state, HashMap<String, Integer> indexMap, HashMap<String, Integer> secIndexMap, HashMap<String, Integer> covIndexMap) {
		String ret = "";
		if(state.equals(prevSt)) {
			ret += "-" + constFactor;
		}else if(state.equals(nextSt)) {
			ret += "+" + constFactor;	
		}else {
			return ret;
		}
//		if(momentFactors.size() == 2) {
//			ret += "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap, indexMap);
//		}else {
//			ret += "*y(" + indexMap.get(momentFactors.get(0).getState()) + ")";
//		}
		for(MomentItem mf: momentFactors){
			if(mf.getOrder() == 1) {
				ret += "*y(" + indexMap.get(mf.getState()) + ")";
			}else {
				System.err.println("ode error");
				// no possibility to beyond 1
			}
		}
		
		return ret;
	}
	
	public String makeSecondMoment(String state, HashMap<String, Integer> indexMap, HashMap<String, Integer> secIndexMap, HashMap<String, Integer> covIndexMap) {
		String ret = "";
		if(state.equals(prevSt) || state.equals(nextSt)) {
			ret += "+" + constFactor + "*(";
		} else {
			return ret;
		}
		if(this.momentFactors.size() == 2) {
			
			ret +=  MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap, indexMap); 
			
			if(state.equals(prevSt) ) {
				ret += "-";
			}else {
				ret += "+";
			}
			int pos = this.findStateInMomentFactors(state);
			if(pos == -1) {
				//ret += "2*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap) + ")*"
					//	+ "y(" + indexMap.get(state) + ")";
				ret += "2*" + make1plus1plus1moment(momentFactors.get(0).getState(), momentFactors.get(1).getState(), state, indexMap, secIndexMap, covIndexMap);
			}else {
				ret += "2*" + make1plus2moment(momentFactors.get(1-pos).getState(), momentFactors.get(pos).getState(), indexMap, secIndexMap, covIndexMap);
			}
		}else { //only one moment factor
			ret += "y(" + indexMap.get(momentFactors.get(0).getState()) + ")";
			if(state.equals(prevSt) ) {
				ret += "-";
			}else {
				ret += "+";
			}
			int pos = this.findStateInMomentFactors(state);
			if(pos == -1) {
				ret += "2*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), state, covIndexMap, indexMap);
			}else {
				ret += "2*y(" + secIndexMap.get(state) + ")";
			}
		}
		
		ret += ")";
		//ret = "+0";
		return ret;
	}
	
	public String makeCovMoment(String st1, String st2, HashMap<String, Integer> indexMap, HashMap<String, Integer> secIndexMap, HashMap<String, Integer> covIndexMap) {
		String ret = "";
		if(st1.equals(prevSt)) {
			if(this.momentFactors.size() == 2) {
				int pos = this.findStateInMomentFactors(st2);
				if(pos == -1) {
//					ret += "-" + constFactor
//							+ "*y(" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap) + ")*"
//							+ "y(" + indexMap.get(st2) + ")";
					ret += "-" + constFactor + "*" + make1plus1plus1moment(momentFactors.get(0).getState(), momentFactors.get(1).getState(), st2, indexMap, secIndexMap, covIndexMap);
				}else {
					ret += "-" + constFactor + "*" + make1plus2moment(momentFactors.get(1-pos).getState(), momentFactors.get(pos).getState(), indexMap, secIndexMap, covIndexMap);
				}
			}else {
				int pos = this.findStateInMomentFactors(st2);
				if(pos == -1) {
					ret += "-" + constFactor + "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), st2, covIndexMap,indexMap);
				}else {
					ret += "-" + constFactor + "*y(" + secIndexMap.get(st2) + ")";
				}
			}
		}
		
		if(st1.equals(nextSt)) {
			if(this.momentFactors.size() == 2) {
				int pos = this.findStateInMomentFactors(st2);
				if(pos == -1) {
//					ret += "+" + constFactor
//							+ "*y(" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap) + ")*"
//							+ "y(" + indexMap.get(st2) + ")";
					ret += "+" + constFactor + "*" + make1plus1plus1moment(momentFactors.get(0).getState(), momentFactors.get(1).getState(), st2, indexMap, secIndexMap, covIndexMap);

				}else {
					ret += "+" + constFactor + "*" + make1plus2moment(momentFactors.get(1-pos).getState(), momentFactors.get(pos).getState(), indexMap, secIndexMap, covIndexMap);
				}
			}else {
				int pos = this.findStateInMomentFactors(st2);
				if(pos == -1) {
					ret += "+" + constFactor + "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), st2, covIndexMap, indexMap);
				}else {
					ret += "+" + constFactor + "*y(" + secIndexMap.get(st2) + ")";
				}
			}
		}
		
		if(st2.equals(prevSt)) {
			if(this.momentFactors.size() == 2) {
				int pos = this.findStateInMomentFactors(st1);
				if(pos == -1) {
//					ret += "-" + constFactor
//							+ "*y(" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap) + ")*"
//							+ "y(" + indexMap.get(st1) + ")";
					ret += "-" + constFactor + "*" + make1plus1plus1moment(momentFactors.get(0).getState(), momentFactors.get(1).getState(), st1, indexMap, secIndexMap, covIndexMap);
				}else {
					ret += "-" + constFactor + "*" + make1plus2moment(momentFactors.get(1-pos).getState(), momentFactors.get(pos).getState(), indexMap, secIndexMap, covIndexMap);
				}
			}else {
				int pos = this.findStateInMomentFactors(st1);
				if(pos == -1) {
					ret += "-" + constFactor + "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), st1, covIndexMap, indexMap);
				}else {
					ret += "-" + constFactor + "*y(" + secIndexMap.get(st1) + ")";
				}
			}
		}
		
		if(st2.equals(nextSt)) {
			if(this.momentFactors.size() == 2) {
				int pos = this.findStateInMomentFactors(st1);
				if(pos == -1) {
//					ret += "+" + constFactor
//							+ "*y(" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap) + ")*"
//							+ "y(" + indexMap.get(st1) + ")";
					ret += "+" + constFactor + "*" + make1plus1plus1moment(momentFactors.get(0).getState(), momentFactors.get(1).getState(), st1, indexMap, secIndexMap, covIndexMap);

				}else {
					ret += "+" + constFactor + "*" + make1plus2moment(momentFactors.get(1-pos).getState(), momentFactors.get(pos).getState(), indexMap, secIndexMap, covIndexMap);
				}
			}else {
				int pos = this.findStateInMomentFactors(st1);
				if(pos == -1) {
					ret += "+" + constFactor + "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), st1, covIndexMap, indexMap);
				}else {
					ret += "+" + constFactor + "*y(" + secIndexMap.get(st1) + ")";
				}
			}
		}
		
		if(st1.equals(prevSt) && st2.equals(nextSt)) {
			if(this.momentFactors.size() == 2) {
				ret += "-" + constFactor
						+ "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap, indexMap);
			}else {
				ret += "-" + constFactor
						+ "*y(" + indexMap.get(momentFactors.get(0).getState()) + ")";
			}
		}
		
		if(st1.equals(nextSt) && st2.equals(prevSt)) {
			if(this.momentFactors.size() == 2) {
				ret += "-" + constFactor
						+ "*" + MomentScripter.getCovIndex(momentFactors.get(0).getState(), momentFactors.get(1).getState(), covIndexMap, indexMap);
			}else {
				ret += "-" + constFactor
						+ "*y(" + indexMap.get(momentFactors.get(0).getState()) + ")";
			}
		}
//		if(!ret.isEmpty()) {
//			ret = "+0";
//		}
		return ret;
	}
	
	public String make1plus2moment(String st1, String st2, HashMap<String, Integer> indexMap, HashMap<String, Integer> secIndexMap, HashMap<String, Integer> covIndexMap) {
		String ret = "y(" + secIndexMap.get(st2) + ")*" + "((" + MomentScripter.getCovIndex(st1, st2, covIndexMap,indexMap) + ")^2)";
		ret += "/" + "(y(" + indexMap.get(st1) + ")"+ "+" + ConstExp.sigma + ")"
				+ "/" + "(y(" + indexMap.get(st2) + ")^2+" + ConstExp.sigma + ")";
		return ret;
	}
	
	public String make1plus1plus1moment(String st1, String st2, String st3, HashMap<String, Integer> indexMap, HashMap<String, Integer> secIndexMap, HashMap<String, Integer> covIndexMap) {
		String ret = MomentScripter.getCovIndex(st1, st2, covIndexMap, indexMap) + "*"
					+ MomentScripter.getCovIndex(st1, st3, covIndexMap, indexMap) + "*" +
					MomentScripter.getCovIndex(st2, st3, covIndexMap, indexMap);
		ret += "/" + "(y(" + indexMap.get(st1) + ")"+ "+" + ConstExp.sigma + ")"
				+ "/" + "(y(" + indexMap.get(st2) + ")+" + ConstExp.sigma + ")" 
				+ "/" + "(y(" + indexMap.get(st3) + ")+" + ConstExp.sigma + ")";
		return ret;
	}
	
	public String getConstFactor() {
		return constFactor;
	}

	public ArrayList<MomentItem> getMomentFactors() {
		return momentFactors;
	}

	public void setMomentFactors(ArrayList<MomentItem> momentItems) {
		this.momentFactors = momentItems;
	}
	
	public void addMomentItem(MomentItem item) {
		for(int i=0; i<momentFactors.size(); i++) {
			if(momentFactors.get(i).getState().equals(item.getState())) {
				momentFactors.get(i).increaseOrder();
				return;
			}
		}
		this.momentFactors.add(item);
	}
	
	public int getTotalMomentOrder() {
		int ret = 0;
		for(MomentItem mf: momentFactors) {
			ret += mf.getOrder();
		}
		return ret;
	}
	
	public int findStateInMomentFactors(String state) {
		for(int i=0; i<momentFactors.size(); i++) {
			if(momentFactors.get(i).getState().equals(state)) {
				return i;
			}
		}
		return -1;
	}		
}
