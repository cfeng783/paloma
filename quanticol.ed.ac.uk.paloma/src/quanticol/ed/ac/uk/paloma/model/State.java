package quanticol.ed.ac.uk.paloma.model;

import java.util.ArrayList;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.model.action.Action;
//import quanticol.ed.ac.uk.paloma.model.action.PropensityFunc;
//import quanticol.ed.ac.uk.paloma.model.action.SpBrAction;
//import quanticol.ed.ac.uk.paloma.model.action.SpNoMsgAction;
//import quanticol.ed.ac.uk.paloma.model.action.SpUnAction;
//import quanticol.ed.ac.uk.paloma.utality.Utality;

public class State {
	String name;
	Loc location;
	String id; //a state must have a unique id
	ArrayList<Action> actionList = new ArrayList<Action>();
	
	public State(String name, int x, int y) {
		this.name = name;
		this.location = new Loc(x,y);
		this.id = genStateID(name, x, y);
		GlobalManager.getLocationManager().addLoc(this.location);
	}
	
	public Loc getLocation() {
		return location;
	}
	
	
	public String getName(){
		return name;
	}
	
	public String getID() {
		return id;
	}
	
	public void addAction(Action a){
		actionList.add(a);
	}
	
	public ArrayList<Action> getActionList() {
		return this.actionList;
	}
	
	public static String genStateID(String name, int x, int y){
		return name + "(" + x + "," + y + ")";
	}
	
	public static boolean matchName(String plotVar, String stateID) {
		int index = stateID.indexOf("(");
		String strName = stateID.substring(0, index);
		return strName.equals(plotVar);
	}
	
	
	public String print() {
		String ret = this.id + " = ";
		for(Action ac: this.actionList) {
			ret += ac.printStr();
			ret += "+";
		}
		return ret.substring(0, ret.length()-1);
	}
}
