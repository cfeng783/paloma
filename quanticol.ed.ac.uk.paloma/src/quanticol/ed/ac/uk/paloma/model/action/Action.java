package quanticol.ed.ac.uk.paloma.model.action;

public interface Action {
	public final static int ACTION_TYPE_SpBr = 101;
	public final static int ACTION_TYPE_InBr = 102;
	public final static int ACTION_TYPE_SpUn = 103;
	public final static int ACTION_TYPE_InUn = 104;
	public final static int ACTION_TYPE_SpNoMsg = 105;
	
	public int getType();
	
	public String getName();
	
	public String getNextState();
	
	public String printStr();
}
