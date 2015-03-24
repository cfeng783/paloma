package quanticol.ed.ac.uk.paloma.model;

import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.utality.Utality;

public class ExpEvaluator {
	
	//evaluate receivePro expression for simulation
	public static double evalProExp(String expr, Loc sloc, Loc rloc) {
		expr = expr.trim();
		expr = expr.replaceAll("\\s", "");
		do{
			//System.out.println(expr);
			int lIndex = expr.indexOf("|", 0);
			int rIndex = expr.indexOf("|", lIndex+1);
			//System.out.println("left:"+lIndex);
			//System.out.println("right:"+rIndex);
			//System.out.println("start:"+startIndex);
			if(lIndex==-1 || rIndex==-1) {
				break;
			}
			String replaceable = expr.substring(lIndex, rIndex+1);
			//System.out.println("replaceable:" +replaceable);
			String strState = expr.substring(lIndex+1, rIndex);
			//System.out.println("strState:" +strState);
			
			int num = GlobalManager.getCounter().getNumberOfAgentInState(strState);
			expr = expr.replace(replaceable, ""+num);
		}while(true);
		
		expr = expr.replaceAll("loc_s", sloc.toString());
		expr = expr.replaceAll("loc_r", rloc.toString());
		
		do {
			int dIndex = expr.indexOf("dist((");
			if(dIndex == -1) {
				break;
			}
			int fIndex = expr.indexOf(")", dIndex);
			
			int d2Index = expr.indexOf('(', fIndex);
			int f2Index = expr.indexOf(')', fIndex+1);
			
			String str1[] = expr.substring(dIndex+6, fIndex).split(",");
			String str2[] = expr.substring(d2Index+1, f2Index).split(",");
			int x0 = Integer.parseInt(str1[0]);
			int y0 = Integer.parseInt(str1[1]);
			
			int x1 = Integer.parseInt(str2[0]);
			int y1 = Integer.parseInt(str2[1]);
			
			double dist = Math.sqrt(Math.pow(x0-x1, 2)+Math.pow(y0-y1, 2));
			expr = expr.replace(expr.substring(dIndex,f2Index+2), dist+"");
			
		}while(true);
		
		
		double ret = Utality.evalParamExpressionForSimulation(expr);
		return ret;
	}
	
	//evaluate receiveWt expression for simulation
	public static double evalWtExp(String expr, Loc sloc, Loc rloc) {
		expr = expr.trim();
		expr = expr.replaceAll("\\s", "");
		do{
			//System.out.println(expr);
			int lIndex = expr.indexOf("|", 0);
			int rIndex = expr.indexOf("|", lIndex+1);
			//System.out.println("left:"+lIndex);
			//System.out.println("right:"+rIndex);
			//System.out.println("start:"+startIndex);
			if(lIndex==-1 || rIndex==-1) {
				break;
			}
			String replaceable = expr.substring(lIndex, rIndex+1);
			//System.out.println("replaceable:" +replaceable);
			String strState = expr.substring(lIndex+1, rIndex);
			//System.out.println("strState:" +strState);
			
			int num = GlobalManager.getCounter().getNumberOfAgentInState(strState);
			expr = expr.replace(replaceable, ""+num);
		}while(true);
		
		expr = expr.replaceAll("loc_s", sloc.toString());
		expr = expr.replaceAll("loc_r", rloc.toString());
		
		do {
			int dIndex = expr.indexOf("dist((");
			if(dIndex == -1) {
				break;
			}
			int fIndex = expr.indexOf(")", dIndex);
			
			int d2Index = expr.indexOf('(', fIndex);
			int f2Index = expr.indexOf(')', fIndex+1);
			
			String str1[] = expr.substring(dIndex+6, fIndex).split(",");
			String str2[] = expr.substring(d2Index+1, f2Index).split(",");
			int x0 = Integer.parseInt(str1[0]);
			int y0 = Integer.parseInt(str1[1]);
			
			int x1 = Integer.parseInt(str2[0]);
			int y1 = Integer.parseInt(str2[1]);
			
			double dist = Math.sqrt(Math.pow(x0-x1, 2)+Math.pow(y0-y1, 2));
			expr = expr.replace(expr.substring(dIndex,f2Index+2), dist+"");
			
		}while(true);
		
		double ret = Utality.evalParamExpressionForSimulation(expr);
		return ret;
	}
	
	//evaluate receivePro expression for matlab ode script
	public static String evalProExpForOde(String expr, HashMap<String, Integer> indexMap, Loc sloc, Loc rloc) {
		String ret = expr.trim();
		expr = expr.replaceAll("\\s", "");
		do{
			//System.out.println(ret);
			int lIndex = ret.indexOf("|", 0);
			int rIndex = ret.indexOf("|", lIndex+1);
			//System.out.println("left:"+lIndex);
			//System.out.println("right:"+rIndex);
			//System.out.println("start:"+startIndex);
			if(lIndex==-1 || rIndex==-1) {
				break;
			}
			String replaceable = ret.substring(lIndex, rIndex+1);
			//System.out.println("replaceable:" +replaceable);
			String strState = ret.substring(lIndex+1, rIndex);
			//System.out.println("strState:" +strState);
			
			String repStr = "y(" + indexMap.get(strState) + ")";
			ret = ret.replace(replaceable, repStr);
		}while(true);
		
		expr = expr.replaceAll("loc_s", sloc.toString());
		expr = expr.replaceAll("loc_r", rloc.toString());
		
		do {
			int dIndex = expr.indexOf("dist((");
			if(dIndex == -1) {
				break;
			}
			int fIndex = expr.indexOf(")", dIndex);
			
			int d2Index = expr.indexOf('(', fIndex);
			int f2Index = expr.indexOf(')', fIndex+1);
			
			String str1[] = expr.substring(dIndex+6, fIndex).split(",");
			String str2[] = expr.substring(d2Index+1, f2Index).split(",");
			int x0 = Integer.parseInt(str1[0]);
			int y0 = Integer.parseInt(str1[1]);
			
			int x1 = Integer.parseInt(str2[0]);
			int y1 = Integer.parseInt(str2[1]);
			
			double dist = Math.sqrt(Math.pow(x0-x1, 2)+Math.pow(y0-y1, 2));
			expr = expr.replace(expr.substring(dIndex,f2Index+2), dist+"");
			
		}while(true);
		
		return ret;
	}
	
	public static String evalWtExpForOde(String expr, HashMap<String, Integer> indexMap, Loc sloc, Loc rloc) {
		String ret = expr.trim();
		do{
			//System.out.println(ret);
			int lIndex = ret.indexOf("|", 0);
			int rIndex = ret.indexOf("|", lIndex+1);
			//System.out.println("left:"+lIndex);
			//System.out.println("right:"+rIndex);
			//System.out.println("start:"+startIndex);
			if(lIndex==-1 || rIndex==-1) {
				break;
			}
			String replaceable = ret.substring(lIndex, rIndex+1);
			//System.out.println("replaceable:" +replaceable);
			String strState = ret.substring(lIndex+1, rIndex);
			//System.out.println("strState:" +strState);
			
			String repStr = "y(" + indexMap.get(strState) + ")";
			ret = ret.replace(replaceable, repStr);
		}while(true);
		
		expr = expr.replaceAll("loc_s", sloc.toString());
		expr = expr.replaceAll("loc_r", rloc.toString());
		
		do {
			int dIndex = expr.indexOf("dist((");
			if(dIndex == -1) {
				break;
			}
			int fIndex = expr.indexOf(")", dIndex);
			
			int d2Index = expr.indexOf('(', fIndex);
			int f2Index = expr.indexOf(')', fIndex+1);
			
			String str1[] = expr.substring(dIndex+6, fIndex).split(",");
			String str2[] = expr.substring(d2Index+1, f2Index).split(",");
			int x0 = Integer.parseInt(str1[0]);
			int y0 = Integer.parseInt(str1[1]);
			
			int x1 = Integer.parseInt(str2[0]);
			int y1 = Integer.parseInt(str2[1]);
			
			double dist = Math.sqrt(Math.pow(x0-x1, 2)+Math.pow(y0-y1, 2));
			expr = expr.replace(expr.substring(dIndex,f2Index+2), dist+"");
			
		}while(true);
		
		return ret;
	}
	
	public static double evalParamExp(String exp) {
		double ret = Utality.evalParamExpressionForSimulation(exp);
		return ret;
	}
}
