package quanticol.ed.ac.uk.paloma.model.action;

public class InBrAction implements Action {
	private String name;
	private double acceptPr;
	
	private String nextState;
	private String PrExp; //reception probability expression
	
	public InBrAction(String name, double acceptPr, String PrExp, String nextState){
		this.name = name;
		this.acceptPr = acceptPr;
		this.PrExp = PrExp;
		this.nextState = nextState;
	}
	
	@Override
	public int getType() {
		return Action.ACTION_TYPE_InBr;
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

	public String getPrExp() {
		return PrExp;
	}

	@Override
	public String printStr() {
		String ret = "?(" + name + "," + acceptPr + ")@Pr{" + PrExp + "}"+"."+nextState;
		return ret;
	}
}
