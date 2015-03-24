package quanticol.ed.ac.uk.paloma.utality;
import java.util.Random;

import bsh.Interpreter;
import bsh.NameSpace;


public class Utality {
	static Random rnd = new Random();
	public final static double Infinity = 100000000;
	public final static double ERROR_NUM = -18943.43439;
	static Interpreter interpreter;
	
	public static void init() {
		rnd.setSeed(System.currentTimeMillis());
		interpreter = new Interpreter();
	}
	
	public static void setParamInInterpreter(String paramName, double paramValue) {
		try {
			interpreter.set(paramName, paramValue);
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	
	public static double ExponentialGenerator(double rate) {	
		Double randomDouble = rnd.nextDouble();
		double ret = -Math.log(1-randomDouble) / rate;
		/*int x = (int) ret;
		if(ret-0.5 >= x) {
			return x+1;
		}else{
			if(x==0) {
				return 1;
			} 
			return x;
		}*/
		return ret;
	}
	
	public static Random getRandom() {
		return rnd;
	}
	
	public static boolean evalExpression(String expr) {
		try{
			expr = expr.replaceAll("'", "\"");
			expr = expr.replaceAll("sqrt", "Math.sqrt");
			expr = expr.replaceAll("pow", "Math.pow");
			expr = expr.replaceAll("abs", "Math.abs");
			//System.out.println(expr);
			Object res = interpreter.eval(expr);
			String str = res.toString();
			//System.out.println(str);
			if(str.equals("true")) {
				return true;
			}else {
				return false;
			}
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public static double evalParamExpressionForSimulation(String expr) {
		double ret = 0;
		try{
			expr = "ret=(double) " + expr;
			expr = expr.replaceAll("'", "\"");
			expr = expr.replaceAll("sqrt", "Math.sqrt");
			expr = expr.replaceAll("pow", "Math.pow");
			expr = expr.replaceAll("abs", "Math.abs");
			//System.out.println(expr);	
			Object res = interpreter.eval(expr);
			ret = (Double)interpreter.get("ret");
			//System.out.println("ret: " + ret);
			//System.out.println("res: " + res.toString());
			return ret;
		}catch(Exception e) {
			e.printStackTrace();
			return ERROR_NUM;
		}
	}
	
	public static String evalExpressionForOdeScripter(String expr) {
		String ret = "0";
		try{
			expr = expr.replaceAll("'", "\"");
		//	expr = expr.replaceAll("sqrt", "Math.sqrt");
		//	expr = expr.replaceAll("pow", "Math.pow");
		//	expr = expr.replaceAll("abs", "Math.abs");
			expr = expr.replace("ret=","ret=\"");
			expr = expr.replace(";","\";");
			//System.out.println(expr);	
			Object res = interpreter.eval(expr);
			ret = (String)interpreter.get("ret");
			//System.out.println("ret: " + ret);
			//System.out.println("res: " + res.toString());
			return ret;
		}catch(Exception e) {
			e.printStackTrace();
			return ret;
		}
	}
}
