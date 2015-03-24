package quanticol.ed.ac.uk.paloma.odedecompose;

public class MomentItem {
	private String state;
	private int order;
	
	public MomentItem(String state, int order) {
		this.state = state;
		this.order = order;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	
	public void increaseOrder() {
		order ++;
	}
	
}
