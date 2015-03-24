package org.xtext.edinburgh.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.services.ISourceProviderService;
import org.xtext.edinburgh.ui.utils.GlobalJobManager;
import org.xtext.edinburgh.ui.utils.PalomaConsoleUtils;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.framework.PalSimulator;
import quanticol.ed.ac.uk.paloma.framework.StochasticEvent;
import quanticol.ed.ac.uk.paloma.palui.ProgressListener;
import quanticol.ed.ac.uk.paloma.palui.SimDialog;

public class RunHandler extends AbstractHandler implements ProgressListener {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		if(event.getCommand().getId().equals("org.xtext.edinburgh.paloma.ui.cancel")) {
			if(GlobalJobManager.job != null) {
				GlobalJobManager.job.cancel();
			}
		}else if(event.getCommand().getId().equals("org.xtext.edinburgh.paloma.ui.simulation")) {
			SimDialog sd = new SimDialog(this);
			sd.setLocationRelativeTo(null);
			sd.setVisible(true);
		}
		return null;
	}

	@Override
	public void notifyProgress(String arg0) {
		if(arg0.equals(ProgressListener.START)) {
			PalomaConsoleUtils.printConsoleStr(arg0 + "\n");
			ISourceProviderService sourceProviderService = (ISourceProviderService) PlatformUI.getWorkbench().getService(  
	                ISourceProviderService.class); 
			// now get my service
			StateSourceProvider commandStateService = (StateSourceProvider) sourceProviderService
			        .getSourceProvider(StateSourceProvider.MY_STATE);
			commandStateService.setState(StateSourceProvider.SIMULATING);
			
			GlobalJobManager.job = new Job("Simulation Running") {
			     protected IStatus run(IProgressMonitor monitor) {
			    	 PalSimulator sim = new PalSimulator();
			    	 sim.setStopTime(GlobalManager.getCounter().getFinalTime());
			         for(int i=0; i<GlobalManager.getCounter().getRuns(); i++) {
			         	if(monitor.isCanceled()) {
			         		//System.out.println("true");
			         		sim.clearEvents();
			         		notifyProgress(ProgressListener.TERMINATE);
			         		return Status.CANCEL_STATUS;
			         	}
			         	int j = i + 1;
			         	notifyProgress("Round "+j);
			         	GlobalManager.preRun(i);
			         	sim.clearEvents();
			         	
			         	sim.setTime(0);
			         	GlobalManager.getCounter().record(0);
			         	
			         	StochasticEvent StocE = new StochasticEvent();
			         	StocE.initPropensityFuncArray();
			         	StocE.scheduleNextEvent(sim);
			         	
			         	sim.doAllEvents();
			            GlobalManager.getCounter().afterRun(i);
			         }
			         notifyProgress(ProgressListener.COMPLETE);
			    	   //if(this.c)
			         return Status.OK_STATUS;
			        }
			     };
			   GlobalJobManager.job.setPriority(Job.LONG);
			   GlobalJobManager.job.schedule(); // start as soon as possible
			
		}else if(arg0.equals(ProgressListener.COMPLETE)){
			PalomaConsoleUtils.printConsoleStr(arg0 + "\n");
			
			ISourceProviderService sourceProviderService = (ISourceProviderService) PlatformUI.getWorkbench().getService(  
	                ISourceProviderService.class); 
			    // now get my service
			StateSourceProvider commandStateService = (StateSourceProvider) sourceProviderService
			        .getSourceProvider(StateSourceProvider.MY_STATE);
			commandStateService.setState(StateSourceProvider.SIMULATED);
		}else if(arg0.equals(ProgressListener.TERMINATE)){
			PalomaConsoleUtils.printConsoleStr("Simulation canceled!" + "\n");
			ISourceProviderService sourceProviderService = (ISourceProviderService) PlatformUI.getWorkbench().getService(  
	                ISourceProviderService.class); 
			    // now get my service
			StateSourceProvider commandStateService = (StateSourceProvider) sourceProviderService
			        .getSourceProvider(StateSourceProvider.MY_STATE);
			commandStateService.setState(StateSourceProvider.PARSED);
		}else {
			PalomaConsoleUtils.printConsoleStr(arg0 + "\n");
		}
		
	}
}
