package quanticol.ed.ac.uk.paloma.facility;

import java.awt.Color;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JFrame;



import quanticol.ed.ac.uk.paloma.framework.GlobalManager;

public class ploter {

	public void plot(String[] states) {
		if(states == null || states.length==0) {
			return;
		}
		GlobalManager.getCounter().prePlot();
		double[] timeTraj = GlobalManager.getCounter().getTimeTrajectory();
		double[][] populationTraj = GlobalManager.getCounter().getPopulationTrajectory();
		
		ArrayList<Plot2DTrajectory> trajectories = new ArrayList<Plot2DTrajectory> ();
		
		for(String state: states) {
			Plot2DTrajectory traj = new Plot2DTrajectory(state, 
					timeTraj, populationTraj[GlobalManager.getCounter().getStateIndex(state)]);
			trajectories.add(traj);
		}
		
		//System.out.println(timeTraj.length);
		LineChart chart = new LineChart(trajectories, "Time", "Population");
		JFrame frame = chart.show();
		
	}
	
	public void plotVariance(String[] states) {
		if(states == null || states.length==0) {
			return;
		}
		GlobalManager.getCounter().prePlot();
		double[] timeTraj = GlobalManager.getCounter().getTimeTrajectory();
		double[][] varTraj = GlobalManager.getCounter().getVarianceTrajectory();
		
		ArrayList<Plot2DTrajectory> trajectories = new ArrayList<Plot2DTrajectory> ();
		
		for(String state: states) {
			Plot2DTrajectory traj = new Plot2DTrajectory(state, 
					timeTraj, varTraj[GlobalManager.getCounter().getStateIndex(state)]);
			trajectories.add(traj);
		}
		LineChart chart = new LineChart(trajectories, "Time", "Variance");
		chart.show();
		
	}
	
	/**
	 * export trajectory to files
	 * */
	public void export(String[] states, String fileFolder) {
		try{
			GlobalManager.getCounter().prePlot();
			PrintWriter sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileFolder + "/timeTraj")),true);  
			double[] timeTraj = GlobalManager.getCounter().getTimeTrajectory();
			for(int i=0; i<timeTraj.length; i++) {
				//System.out.println(str);
				sw.println(timeTraj[i]);
			}
			sw.close();
			
			double[][] populationTraj = GlobalManager.getCounter().getPopulationTrajectory();
			
			
			for(String state: states) {
				sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileFolder+"/"+state+"_mean")),true); 
				int i = GlobalManager.getCounter().getStateIndex(state);
				for(int j=0; j<populationTraj[i].length; j++) {
					sw.println(populationTraj[i][j]);
				}
				sw.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void exportVariance(String[] states, String fileFolder) {
		try{
			GlobalManager.getCounter().prePlot();
			PrintWriter sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileFolder + "/timeTraj")),true);  
			double[] timeTraj = GlobalManager.getCounter().getTimeTrajectory();
			for(int i=0; i<timeTraj.length; i++) {
				//System.out.println(str);
				sw.println(timeTraj[i]);
			}
			sw.close();
			
			double[][] varianceTraj = GlobalManager.getCounter().getVarianceTrajectory();
			
			for(String state: states) {
				sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(fileFolder+"/"+state+"_variance")),true); 
				int i = GlobalManager.getCounter().getStateIndex(state);
				for(int j=0; j<varianceTraj[i].length; j++) {
					sw.println(varianceTraj[i][j]);
				}
				sw.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void tempExport(String filename, ArrayList<Double> data) {
		try{
			GlobalManager.getCounter().prePlot();
			PrintWriter sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("./../data/trajectories/" + filename)),true);  
			for(int i=0; i<data.size(); i++) {
				//System.out.println(str);
				sw.println(data.get(i));
			}
			sw.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
