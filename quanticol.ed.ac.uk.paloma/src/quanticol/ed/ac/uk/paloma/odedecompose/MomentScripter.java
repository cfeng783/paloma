package quanticol.ed.ac.uk.paloma.odedecompose;

import java.util.ArrayList;
import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.model.ExpEvaluator;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.model.action.Action;
import quanticol.ed.ac.uk.paloma.model.action.InBrAction;
import quanticol.ed.ac.uk.paloma.model.action.InUnAction;
import quanticol.ed.ac.uk.paloma.model.action.SpBrAction;
import quanticol.ed.ac.uk.paloma.model.action.SpNoMsgAction;
import quanticol.ed.ac.uk.paloma.model.action.SpUnAction;
import quanticol.ed.ac.uk.paloma.framework.GlobalManager;

/**
 * The matlab scripter for generating matlab scripts for moments
 */
public class MomentScripter {
	public final static int FIRST_MOMENT = 1001;
	public final static int SECOND_MOMENT = 1002;
	//HashMap<String, State> stateMap;
	ArrayList<State> stateList;
	//HashMap<String, ArrayList<State>> nextStateMap = new HashMap<String, ArrayList<State>>(); //key is State B, A=(a,r).B 
	HashMap<String, Integer> indexMap = new HashMap<String, Integer>(); //indexMap for first moment
	//HashMap<String, ArrayList<PTransition>> stateTransMap = new HashMap<String, ArrayList<PTransition>>();
	
	HashMap<String, Integer> secondIndexMap = new HashMap<String, Integer>(); //indexMap for second moment
	
	HashMap<String, Integer> covIndexMap = new HashMap<String, Integer>(); //indexMap for covariance
	
	HashMap<Integer, String> covStateMap = new HashMap<Integer,String>();
	
	ArrayList<PTransition> PTransArray = new ArrayList<PTransition>();
	
	int finalOdeIndex;
	
	String colorArray[] = {	
			"'r-'",
			"'g-'",
			"'b-'",
			"'y-'",
			"'m-'",
			"'c-'",
			"'k-'",
			"'r-.'",
			"'g-.'",
			"'b-.'",
			"'y-.'",
			"'m-.'",
			"'c-.'",
			"'k-.'"};
	
	public MomentScripter(HashMap<String, State> stateMap, int threshold) {
		stateList = new ArrayList<State>();
		for(String key: stateMap.keySet()) {
			State st = stateMap.get(key);
			stateList.add(st);
		}
		for(int i=0;i<stateList.size();i++) {
			indexMap.put(stateList.get(i).getID(), i+1);
			secondIndexMap.put(stateList.get(i).getID(), i+1+stateList.size());
		}
		
		int current = 2*stateList.size() + 1;
		for(int i=0; i<stateList.size(); i++) {
			for(int j=0; j<stateList.size(); j++) {
				State st1 = stateList.get(i);
				State st2 = stateList.get(j);
				if(!st1.getID().equals(st2.getID())) {
					//check correlation of st1 and st2 here
					//check if they are one-hop neighbors
					int cor1 = Decomposer.checkCorrelation(st1, st2, stateMap, Decomposer.ONE_HOP_NEIGHBOR);
					int cor2 = Decomposer.checkCorrelation(st2, st1, stateMap, Decomposer.ONE_HOP_NEIGHBOR);
					int correlation = Math.min(cor1, cor2);
					//System.out.println(st1.getID()+ " with " + st2.getID() + " : " + correlation);
					
					if(!checkCovItem(st1.getID(), st2.getID()) && correlation <= threshold) {
						covIndexMap.put(makeCovKey(st1.getID(), st2.getID()), current);
						covStateMap.put(current, makeCovKey(st1.getID(), st2.getID()));
						current ++;
					}
				}
			}
		}
		finalOdeIndex = current;

	}
	
	public void initPTransitions() {
		for(int n=1; n<=stateList.size(); n++) {
			State st = stateList.get(n-1);
			//deal with flux out
			for(int i=0;i<st.getActionList().size();i++) {
				Action ac = st.getActionList().get(i);
				if(ac.getNextState().equals(st.getID())) {
					continue;
				}
				if(ac.getType() == Action.ACTION_TYPE_SpNoMsg) {
					SpNoMsgAction spNoMsgA = (SpNoMsgAction) ac;
					String constFactor = spNoMsgA.getRate()+"";
					PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
					pt.addMomentItem(new MomentItem(st.getID(),1));
					PTransArray.add(pt);
				}else if(ac.getType() == Action.ACTION_TYPE_SpBr) {
					SpBrAction spBrA = (SpBrAction) ac;
					String constFactor = spBrA.getRate() + "";
					PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
					pt.addMomentItem(new MomentItem(st.getID(),1));
					PTransArray.add(pt);
				}else if(ac.getType() == Action.ACTION_TYPE_SpUn) {
					SpUnAction spUnA = (SpUnAction) ac;
					String constFactor = spUnA.getRate() + "";
					PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
					pt.addMomentItem(new MomentItem(st.getID(),1));
					PTransArray.add(pt);
				}else if(ac.getType() == Action.ACTION_TYPE_InBr) {
					InBrAction inBrA = (InBrAction) ac;
					for(int j=0; j<stateList.size(); j++) {
						State senderState = stateList.get(j);
						for(Action senderAction: senderState.getActionList()) {
							if(senderAction.getType() == Action.ACTION_TYPE_SpBr && senderAction.getName().equals(ac.getName())) {
								SpBrAction senderSpBrA = (SpBrAction) senderAction;
								HashMap<String, Loc> BrRange = GlobalManager.getLocationManager().evalMsgRange(senderState.getLocation(), senderSpBrA.getRangeExp());
								if(BrRange.get(st.getLocation().getKey()) != null) {
									String constFactor = senderSpBrA.getRate() + "*" + inBrA.getAcceptPr()
															+ "*" + ExpEvaluator.evalProExpForOde(inBrA.getPrExp(), indexMap, 
																	senderState.getLocation(), st.getLocation());
									PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
									pt.addMomentItem(new MomentItem(senderState.getID(),1));
									pt.addMomentItem(new MomentItem(st.getID(),1));
									PTransArray.add(pt);
								}
							}
						}
					}	
				}else if(ac.getType() == Action.ACTION_TYPE_InUn) {
					InUnAction inUnA = (InUnAction) ac;
					for(int j=0; j<stateList.size(); j++) {
						State senderState = stateList.get(j);
						for(Action senderAction: senderState.getActionList()) {
							if(senderAction.getType() == Action.ACTION_TYPE_SpUn && senderAction.getName().equals(ac.getName())) {
								SpUnAction senderSpUnA = (SpUnAction) senderAction;
								HashMap<String, Loc> UniRange = GlobalManager.getLocationManager().evalMsgRange(senderState.getLocation(), senderSpUnA.getRangeExp());
								if(UniRange.get(st.getLocation().getKey()) != null) {
									/*String weightSum = calWtSum(UniRange, ac.getName());
									if(weightSum.indexOf("y(") == weightSum.lastIndexOf("y(")) {
										String str1 = weightSum.substring(0, weightSum.indexOf("*y("));
										//String deleteStr = "*y(" + indexMap.get(st.getID())+")";
										weightSum = str1 + ")";
										String constFactor = senderSpUnA.getRate() + "*" + inUnA.getAcceptPr() + "*"
											+ ExpEvaluator.evalWtExpForOde(inUnA.getWtExp(), indexMap) + "/" + weightSum + "*y(" + indexMap.get(st.getID())+")"
											+ "/(" + "y(" + indexMap.get(st.getID())+")" + "+eps)";
										PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
										pt.addMomentItem(new MomentItem(senderState.getID(),1));
										PTransArray.add(pt);
									}else {*/
										String constFactor = senderSpUnA.getRate() + "*" + inUnA.getAcceptPr() + "*"
											+ ExpEvaluator.evalWtExpForOde(inUnA.getWtExp(), indexMap,
													senderState.getLocation(), st.getLocation()) + "/" + calWtSum(UniRange, ac.getName(), senderState.getLocation());
										PTransition pt = new PTransition(st.getID(), ac.getNextState(), constFactor);
										pt.addMomentItem(new MomentItem(senderState.getID(),1));
										pt.addMomentItem(new MomentItem(st.getID(),1));
										PTransArray.add(pt);
									//}
									
									
								}
							}
						}
					}
				}
			}
			
		}
//		for(PTransition pt: PTransArray) {
//			System.out.println(pt.toString());
//		}
	}
	
	
	public ArrayList<String> genOdes() {
		initPTransitions();
		ArrayList<String> var = new ArrayList<String>();
		String strFunc = "function dy = " + " fluidflow" + "(t,y)";
		var.add(strFunc);
		for(String key: GlobalManager.getParamManager().getParamMap().keySet()) {
			double value = GlobalManager.getParamManager().getParamValue(key);
			var.add(key+"="+value+";");
		}
		int size = this.finalOdeIndex - 1;
		String strDy = "dy=zeros(" + size +",1);";
		var.add(strDy);
		
		for(int n=1; n<=stateList.size(); n++) {	
			String ode = "dy(" + n +  ")=0";
			//String ode = stateList.get(n-1).getID()+ " dy(" + n +  ")=0";
			State st = stateList.get(n-1);
			for(PTransition pTrans: PTransArray) {
				ode += pTrans.makeFirstMoment(st.getID(), indexMap, secondIndexMap, covIndexMap);
			}
			ode += ";";
			//ode += st.getID();
			var.add(ode);
		}
		for(int i=0; i<stateList.size(); i++) {	
			State st = stateList.get(i);
			String ode = "dy(" + secondIndexMap.get(st.getID()) +  ")=0";
			for(PTransition pTrans: PTransArray) {
				ode += pTrans.makeSecondMoment(st.getID(), indexMap, secondIndexMap, covIndexMap);
			}
			ode += ";";
			//ode += st.getID();
			var.add(ode);
		}
		
		for(int i=2*stateList.size()+1; i<finalOdeIndex; i++) {
			String ode = "dy(" + i +  ")=0";
			String st[] = resolveCovKey(covStateMap.get(i));
			for(PTransition pTrans: PTransArray) {
				ode += pTrans.makeCovMoment(st[0], st[1], indexMap, secondIndexMap, covIndexMap);
			}
			ode += ";";
			//ode += covStateMap.get(i);
			var.add(ode);
		}
		
		return var;
	}
	
	
	public ArrayList<String> genMatlabScript(int mode, int timelength, ArrayList<String> plotVars) {
		ArrayList<String> var = new ArrayList<String>();
		int num[] = new int[stateList.size()+1];
		for(int i=0; i<GlobalManager.getInitAgentList().size(); i++) {
			int count = GlobalManager.getInitAgentList().get(i).getCount();
			int ind = indexMap.get(GlobalManager.getInitAgentList().get(i).getStateID());
			num[ind] += count;
		}
		
		String func = "[T,Y]=ode45(@fluidflow,[0 "+ timelength +"],[";
		for(int i=1; i<num.length; i++) {
			func += " " + num[i];
		}
		for(int i=1; i<num.length; i++) {
			int trueNum = num[i] * num[i];
			func += " " + trueNum;
		}
		
		for(int i=2*stateList.size()+1; i<finalOdeIndex; i++) {
			String st[] = resolveCovKey(covStateMap.get(i));
			int pos1 = indexMap.get(st[0]);
			int pos2 = indexMap.get(st[1]);
			int trueNum = num[pos1] * num[pos2];
			func += " " + trueNum;
		}
		
		func += "]);";
		var.add(func);
		
		if(plotVars.size()>colorArray.length) {
			System.err.println("too many vars to plot!");
			return null;
		}
		
		for(int i=0; i<plotVars.size();i++) {
			String plotVar = plotVars.get(i);
			Integer index = indexMap.get(plotVar);
			if(index == null) {//for special plot
//				String str = "plot(T,";
//				for(int j=0; j<stateList.size(); j++) {
//					if(State.matchName(plotVar, stateList.get(j).getID())) {
//						int k = j+1;
//						if(str.length()==7) {
//							str += "Y(:," + k + ")";
//						}else {
//							str += "+Y(:," + k + ")";
//						}
//					}
//					
//				}
//				str+=","+colorArray[i]+ ",'LineWidth',2" + ");";
//				var.add(str);
			}else{
				if(mode == FIRST_MOMENT) {
					String str = "plot(T,Y(:," + index.toString() +"),"+colorArray[i]+",'LineWidth',2" + ");";
					var.add(str);
				}else if(mode == SECOND_MOMENT) {
					int smIndex = index + stateList.size();
					String str2 = "plot(T,Y(:," + smIndex +"),"+colorArray[i]+",'LineWidth',2" + ");";
					var.add(str2);
				}
			}
			String strHold = "hold on;";
			var.add(strHold);
		}
		
		String xL = "xlabel('time');";
		String yL = "ylabel('value');";
		var.add(xL);
		var.add(yL);
		
		String strLegend = "legend(";
		for(int i=0; i<plotVars.size();i++) {
			String plotVar = plotVars.get(i);
			if(i==plotVars.size()-1) {
				//strLegend += "'" + plotVar + "',";
				strLegend += "'" + plotVar + "');";
			}else{
				//strLegend += "'" + plotVar + "',";
				strLegend += "'" + plotVar + "',";
			}
		}
		var.add(strLegend);
		return var;
	}
	
	public String calWtSum(HashMap<String, Loc> rangeMap, String msgName, Loc senderLoc) {
		boolean isFirst = true;
		String priSum = "("; // the sum of priority
		for(State state: stateList) {
			Loc loc = state.getLocation();
			if(rangeMap.get(loc.getKey()) != null) { //check if the state is within the unicast range
				for(Action action: state.getActionList()) {
					if(action.getType() == Action.ACTION_TYPE_InUn) {
						InUnAction inUni = (InUnAction) action;
						if(inUni.getName().equals(msgName)) {
							String pri = ExpEvaluator.evalWtExpForOde(inUni.getWtExp(), indexMap, senderLoc, loc);
							if(isFirst) {
								priSum += pri + "*y(" + indexMap.get(state.getID()) + ")";
								isFirst = false;
							}else {
								priSum += "+" + pri + "*y(" + indexMap.get(state.getID()) + ")";
							}
							break;
						}
					}
				}
			}
    	}
		priSum += ")";
		//System.out.println(priSum);
		return priSum;
	}
	
	public static String makeCovKey(String st1, String st2) {
		return st1 + "*" + st2;
	}
	
	public static String[] resolveCovKey(String covKey) {
		String st[] = new String[2];
		int index = covKey.indexOf("*");
		st[0] = covKey.substring(0, index);
		st[1] = covKey.substring(index+1);
		return st;
	}
	
	//looke for a cov item in covIndexMap, return true for existence
	public boolean checkCovItem(String st1, String st2) {
		if(covIndexMap.get(makeCovKey(st1, st2)) != null || covIndexMap.get(makeCovKey(st2, st1)) != null) {
			return true;
		}else {
			return false;
		}
	}
	
	public static String getCovIndex(String st1, String st2, HashMap<String, Integer> covMap, HashMap<String, Integer> indexMap) {
		if(covMap.get(makeCovKey(st1, st2)) != null) {
			return "y(" + covMap.get(makeCovKey(st1, st2)) + ")";
		}
		if(covMap.get(makeCovKey(st2, st1)) != null) {
			return "y(" + covMap.get(makeCovKey(st2, st1)) + ")";
		}
		return "y(" + indexMap.get(st1) + ")*y(" + indexMap.get(st2) + ")";
	}
	
}
