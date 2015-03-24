package quanticol.ed.ac.uk.paloma.framework;

public class PalSimulator extends Simulator {
	
	public PalSimulator() {
		events = new ListQueue();
	}
	
	public void setStopTime(double stopTime) {
		this.final_time = stopTime;
	}
	
	public void doAllEvents() {
		super.doAllEvents();
	}
	
	public void clearEvents() {
		events.clear();
	}
	
	public void setTime(double time) {
		this.time = time;
	}
	
//	public void startSimulation() {
//        this.final_time = GlobalManager.getCounter().getFinalTime();
//        //progressListener.notifyProgress(ProgressListener.START);
//        for(int i=0; i<GlobalManager.getCounter().getRuns(); i++) {
//        	
//        	int j = i + 1;
//        	progressListener.notifyProgress("Round "+j);
//        	GlobalManager.preRun(i);
//        	events.clear();
//        	
//        	this.time = 0;
//        	GlobalManager.getCounter().record(0);
//        	
//        	StochasticEvent StocE = new StochasticEvent();
//        	StocE.initPropensityFuncArray();
//        	StocE.scheduleNextEvent(this);
//        	
//            doAllEvents();
//            GlobalManager.getCounter().afterRun(i);
//        }
//        progressListener.notifyProgress(ProgressListener.COMPLETE);
//    }

}