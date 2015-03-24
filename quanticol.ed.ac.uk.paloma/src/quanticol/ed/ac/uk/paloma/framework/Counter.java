package quanticol.ed.ac.uk.paloma.framework;

import java.util.ArrayList;
import java.util.HashMap;


import quanticol.ed.ac.uk.paloma.model.State;

public class Counter {
	final static double DEFAULT_TIME_POINTS = 199.0;
	double finalTime;
	int runs;
	
	double[] timeTrajectory;
	double[][] populationTrajectory;
	double[][] varianceTrajectory;
	
	ArrayList<Double> time = new ArrayList<Double>();
	ArrayList<ArrayList<Double>> population = new ArrayList<ArrayList<Double>>();
	
	//ArrayList<String> plotVars = new ArrayList<String>();
	
	ArrayList<ArrayList<Double>> statistics_mean = new ArrayList<ArrayList<Double>>();
	ArrayList<ArrayList<Double>> statistics_variance = new ArrayList<ArrayList<Double>>();
	
	//theses two variable count for number of agents of in specific states
	private HashMap<String, Integer> stateIndexMap = new HashMap<String, Integer>();
	int[] curCount; 
	
	double[] lastRecPopu;
	double timeStep;
	
	double currentStep=0;
	
	public Counter() {}
	
	public void setUp(int runs, double finalTime) {
		this.finalTime = finalTime;
		this.runs = runs;
		timeStep = this.finalTime/DEFAULT_TIME_POINTS;
	}
	

	public int getRuns() {
		return this.runs;
	}
	
	public double getFinalTime() {
		return this.finalTime;
	}
	
	public void preRun(int curRun) {
		currentStep = 0;
		for(int i=0; i<lastRecPopu.length; i++) {
			lastRecPopu[i]=0;
		}
		if(curRun==0) {
		}else{
			//System.out.println("time size before run: " + time.size());
			time.clear();
			for(int i=0; i<population.size();i++) {
				population.get(i).clear();
			}
		}
		record(0);
	}
	
	public void afterRun(int curRun){
		while(time.size()<DEFAULT_TIME_POINTS+1) {
			double t = time.get(time.size()-1);
			t += timeStep;
			//time.add(t);
			time.add(t);
		}
		for(int i=0; i<population.size();i++) {
			while(population.get(i).size()<DEFAULT_TIME_POINTS+1) {			
				//double s = statistics.get(i).get(statistics.get(i).size()-1);
				population.get(i).add(lastRecPopu[i]);
			
			}
		}
		
		//System.out.println("time size after run:"+time.size());
		if(curRun == 0) {
			//System.out.println("population size after run:"+population.get(0).size());
			for(int i=0; i<population.size();i++) {
				for(int j=0;j<population.get(i).size();j++) {
					double num = population.get(i).get(j);
					//System.out.println(num);
					statistics_mean.get(i).add(num);
					statistics_variance.get(i).add(Math.pow(num,2));
				}
			}
		}else {
			//System.out.println("population size after run:"+population.get(0).size());
			for(int i=0; i<population.size();i++) {
				for(int j=0;j<population.get(i).size();j++) {
					double num = population.get(i).get(j);
					statistics_variance.get(i).set(j,Math.pow(num, 2)+statistics_variance.get(i).get(j));
					double real = (num+statistics_mean.get(i).get(j)*curRun)/(curRun+1); 
					statistics_mean.get(i).set(j, real);
				}
			}
		}
	}
	
	public void setupStateIndexMap(HashMap<String, State> stateMap) {
		int i = 0;
		for(String key: stateMap.keySet()) {
			stateIndexMap.put(key, i);
			i++;
			ArrayList<Double> pop = new ArrayList<Double>();
			population.add(pop);
			ArrayList<Double> po2 = new ArrayList<Double>();
			statistics_mean.add(po2);
			ArrayList<Double> po3 = new ArrayList<Double>();
			statistics_variance.add(po3);
		}
		curCount = new int[i];
		lastRecPopu = new double[i];
	}
	
	public int getStateIndex(String state){
		return stateIndexMap.get(state);
	}
	
	public HashMap<String, Integer> getStateIndexMap() {
		return stateIndexMap;
	}
	
	public void record(double t) {
		//System.out.println("t:" + t);
		if(t>=currentStep && time.size()>0) {
			int forwardSteps = 0;
			while(currentStep <= t) {
				//time.add(currentStep);
				time.add(currentStep);
				currentStep = currentStep + timeStep;
				forwardSteps ++;
			}
			//time.add(currentStep);
			//time.add(currentStep);
			for(int i=0; i<lastRecPopu.length; i++) {
				double num = lastRecPopu[i];
				for(int j=0; j<forwardSteps; j++) {
					//population.get(i).add(population.get(i).get(population.get(i).size()-1));
					population.get(i).add(num);
				}
			}
			//currentStep = currentStep + timeStep;
		}
		
		//clear curCount every time before recording
		//System.out.println("new");
		for(int i=0; i<curCount.length; i++) {
			//System.out.println(curCount[i]);
			curCount[i] = 0;
		}
		
		//int[] tempCounter = new int[plotVars.size()];
		
		for(String key: GlobalManager.getAgentList().keySet()) {
//			for(int i=0; i<plotVars.size(); i++) {
//				if(e.curStateID.equals(plotVars.get(i)) ) {
////						|| State.matchName(plotVars.get(i), e.curStateID)){
//					tempCounter[i]++;
//					//System.out.print("true");
//					//int cnt = tempCounter.get(i) + 1;
//					//tempCounter.set(i, cnt);
//				}
//			}
			//should do count of all agent in state
			//System.out.println("e.getCurStateID()" + e.getCurStateID());
			Agent e = GlobalManager.getAgentList().get(key);
			curCount[stateIndexMap.get(e.getStateID())] += e.getCount();
		}
		
		for(int i=0; i<curCount.length; i++) {
			//double num = tempCounter.get(i);
			lastRecPopu[i] = curCount[i];
		}
		
		if(time.size() == 0) {
			time.add(currentStep);
			for(int i=0; i<lastRecPopu.length; i++) {
				double num = lastRecPopu[i];
				//System.out.println(""+i+" "+lastRecPopu[i]);
				population.get(i).add(num);
			}
		}
	}
	
	
	
	public void prePlot() {
		//System.out.println("time size: "+time.size());
		timeTrajectory = new double[time.size()];
		for(int i=0; i<time.size();i++) {
			timeTrajectory[i] = time.get(i);
		}
		populationTrajectory = new double[statistics_mean.size()][];
		for(int i=0; i<statistics_mean.size();i++) {
			//System.out.println("pop si: "+statistics_mean.get(i).size());
			populationTrajectory[i] = new double[statistics_mean.get(i).size()];
			for(int j=0;j<statistics_mean.get(i).size();j++) {
				populationTrajectory[i][j] = statistics_mean.get(i).get(j);
			}
		}
		
		varianceTrajectory = new double[statistics_variance.size()][];
		for(int i=0; i<statistics_variance.size();i++) {
			//System.out.println("variance size: "+this.runs);
			varianceTrajectory[i] = new double[statistics_variance.get(i).size()];
			for(int j=0;j<statistics_variance.get(i).size();j++) {
				varianceTrajectory[i][j] = (statistics_variance.get(i).get(j)/this.runs) 
					- Math.pow(populationTrajectory[i][j], 2);
				//varianceTrajectory[i][j] = (statistics_variance.get(i).get(j)/this.runs);//for second moment
			}
		}
		
		
	}
	
//	public ArrayList<String> getPlotVars() {
//		return this.plotVars;
//	}
	
	public double[] getTimeTrajectory() {
		return timeTrajectory;
	}
	
	public double[][] getPopulationTrajectory(){
		return populationTrajectory;
	}
	
	public double[][] getVarianceTrajectory(){
		return varianceTrajectory;
	}
	
	public int getNumberOfAgentInState(String stateID) {
		return curCount[stateIndexMap.get(stateID)];
	}
	
	public void fastRecord(String prevSt, String nextSt) {
		curCount[stateIndexMap.get(prevSt)]--;
		curCount[stateIndexMap.get(nextSt)]++;
	}
	
	public void clear() {
		finalTime = 0;
		runs = 0;
		
		timeTrajectory = null;
		populationTrajectory = null;
		varianceTrajectory = null;
		
		time.clear();
		population.clear();
		
//		plotVars.clear();
		
		statistics_mean.clear();
		statistics_variance.clear();
		
		//theses two variable count for number of agents of in specific states
		stateIndexMap.clear();
		curCount = null; 
		
		lastRecPopu = null;
		timeStep = 0;
		
		currentStep=0;
	}
}
