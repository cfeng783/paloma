package quanticol.ed.ac.uk.paloma.palui;


public interface ProgressListener {
	public final static String START = "Simulation Started!";
	public final static String COMPLETE = "Simulation Completed!";
	public final static String TERMINATE = "Simulation Terminated!";
	
	public void notifyProgress(String info);
}
