package quanticol.ed.ac.uk.paloma.model.action;

public class InUnAction implements Action {
	private String name;
	private double acceptPr;
	
	private String nextState;
	private String WtExp; //reception weight expression
	
	public InUnAction(String name, double acceptPr, String WtExp, String nextState){
		this.name = name;
		this.acceptPr = acceptPr;
		this.WtExp = WtExp;
		this.nextState = nextState;
	}
	
	@Override
	public int getType() {
		return Action.ACTION_TYPE_InUn;
	}
	

	public String getName() {
		return name;
	}
	
	@Override
	public String getNextState() {
		return nextState;
	}

	public double getAcceptPr() {
		return acceptPr;
	}

	public String getWtExp() {
		return WtExp;
	}

	@Override
	public String printStr() {
		String ret = "??(" + name + "," + acceptPr + ")@Wt{" + WtExp + "}"+"."+nextState;
		return ret;
	}
}
