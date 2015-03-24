package quanticol.ed.ac.uk.paloma.model.action;

public class SpBrAction implements Action {
	private String name;
	private double rate;
	
	private String nextState;
	private String rangeExp;
	
	public SpBrAction(String name, double rate, String rangeExp, String nextState){
		this.name = name;
		this.rate = rate;
		this.rangeExp = rangeExp;
		this.nextState = nextState;
	}
	
	@Override
	public int getType() {
		return Action.ACTION_TYPE_SpBr;
	}
	

	public String getName() {
		return name;
	}
	
	@Override
	public String getNextState() {
		return nextState;
	}

	public double getRate() {
		return rate;
	}

	public String getRangeExp() {
		return rangeExp;
	}

	@Override
	public String printStr() {
		String ret = "!(" + name + "," + rate + ")@IR{" + rangeExp + "}"+"."+nextState;
		return ret;
	}
}
