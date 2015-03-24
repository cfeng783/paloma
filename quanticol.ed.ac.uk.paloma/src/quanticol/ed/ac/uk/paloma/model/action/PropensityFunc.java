package quanticol.ed.ac.uk.paloma.model.action;


public class PropensityFunc {
	private String stateID;
	private Action action;
	private double rate;
	private double internalRate;
	
	public PropensityFunc(String stateID, Action action, double internalRate) {
		this.stateID = stateID;
		this.action = action;
		this.internalRate = internalRate;
	}
	
	public String getStateID() {
		return stateID;
	}
	public void setStateID(String stateID) {
		this.stateID = stateID;
	}
	public Action getAction() {
		return action;
	}
	public void setActionIndex(Action action) {
		this.action = action;
	}
	public double getApparentRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double getInternalRate() {
		return internalRate;
	}
}
