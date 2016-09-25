package quanticol.ed.ac.uk.paloma.framework;

import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.model.Loc;


/**
 * A runtime msg
 */
public class RuntimeMsg {
	public final static int TYPE_Br = 1001;
	public final static int TYPE_Un = 1002;
	private String name;
	private int type;
	private HashMap<String, Loc> range;
	private Loc senderLoc;
	
	public RuntimeMsg(String name, Loc senderLoc, int type, HashMap<String, Loc> range) {
		this.name = name;
		this.type = type;
		this.range = range;
		this.senderLoc = senderLoc;
	}
	
	public Loc getSenderLoc() {
		return senderLoc;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public HashMap<String, Loc> getRange() {
		return range;
	}

}
