package quanticol.ed.ac.uk.paloma.model.action;

public class SpNoMsgAction implements Action {
	
	private String name;
	private double rate;
	private String nextState;
	
	public SpNoMsgAction(String name, double rate, String nextState){
		this.name = name;
		this.rate = rate;
		this.nextState = nextState;
	}
	
	public String getName() {
		return name;
	}
	
	public double getRate() {
		return rate;
	}

	
	@Override
	public int getType() {
		// TODO Auto-generated method stub
		return Action.ACTION_TYPE_SpNoMsg;
	}

	@Override
	public String getNextState() {
		// TODO Auto-generated method stub
		return this.nextState;
	}

	@Override
	public String printStr() {
		String ret = "(" + name + "," + rate + ")."+nextState;
		return ret;
	}

}
