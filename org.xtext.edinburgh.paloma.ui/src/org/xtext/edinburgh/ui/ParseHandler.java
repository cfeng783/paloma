package org.xtext.edinburgh.ui;

import java.util.HashMap;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.IDocument;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.services.ISourceProviderService;
import org.eclipse.ui.texteditor.ITextEditor;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.xtext.edinburgh.PalomaStandaloneSetup;
import org.xtext.edinburgh.ui.utils.PalomaConsoleUtils;

import quanticol.ed.ac.uk.paloma.framework.Agent;
import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.realparser.PalomaParser;

import com.google.inject.Injector;

public class ParseHandler extends AbstractHandler {

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		final IEditorPart editor = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage()
		        .getActiveEditor();
		
		if (!(editor instanceof ITextEditor)) return null;
		ITextEditor ite = (ITextEditor)editor;
		
		if(ite.isDirty()) {
			MessageDialog.openWarning(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"warning", "Your file has been changed, please save the change before parsing it!");
			return null;
		}
		IFile file = (IFile) ite.getEditorInput().getAdapter(IFile.class);
		String filepath = file.getRawLocation().toOSString();
//		MessageDialog.openInformation(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
//				"Info", filepath);
		//new org.eclipse.emf.mwe.utils.StandaloneSetup().setPlatformUri("../");
		Injector injector = new PalomaStandaloneSetup().createInjectorAndDoEMFRegistration();
		XtextResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);
		resourceSet.addLoadOption(XtextResource.OPTION_RESOLVE_ALL, Boolean.TRUE);
		Resource resource = resourceSet.getResource(URI.createURI("file:"+filepath), true);
		
		if(resource.getErrors().size() > 0) {
			MessageDialog.openError(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
					"warning", "Your model has errors, please fix the errors before parsing it!");
			return null;
			
		}
		IDocument doc = ite.getDocumentProvider().getDocument(ite.getEditorInput());
		
		
		
		GlobalManager.init();
		//clear the previous model if there is one
		GlobalManager.clear();
		GlobalManager.clearCounter();
		GlobalManager.clearPlotVars();
		//System.out.println("here3");
		//model read
		String parseException = "";
		boolean isParseOK = true;
		try {
			PalomaParser parser = new PalomaParser();
			parser.parseFromString(doc.get());
		}catch(Exception parseExp) {
			parseException = parseExp.getMessage();
			isParseOK = false;
		}
		
//		IConsole myConsole = PalomaConsoleUtils.getPalomaConsole();
//		IWorkbenchPage page = HandlerUtil.getActiveWorkbenchWindow(event).getActivePage();
//		String id = IConsoleConstants.ID_CONSOLE_VIEW;
//		try {
//			IConsoleView view = (IConsoleView) page.showView(id);
//			view.display(myConsole);
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
		if(isParseOK) {
//			MessageDialog.openWarning(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
//					"warning", "parse ok");
			HashMap<String, Integer> initAgentMap = new HashMap<String, Integer>();
			for(Agent agent: GlobalManager.getInitAgentList()) {
				initAgentMap.put(agent.getStateID(), 1);
			}
			
			for(String key: GlobalManager.getStateManager().getStateMap().keySet()) {
				if(initAgentMap.get(key) == null) {
					Agent e = new Agent(key, 0);
					GlobalManager.addAgent(e);
				}
			}
			PalomaConsoleUtils.printConsoleStr("The model has been parsed successfully!\n");
			
			ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
			        .getActiveWorkbenchWindow(event).getService(ISourceProviderService.class);
			    // now get my service
			StateSourceProvider commandStateService = (StateSourceProvider) sourceProviderService
			        .getSourceProvider(StateSourceProvider.MY_STATE);
			commandStateService.setState(StateSourceProvider.PARSED);
			return null;
			
		}else {
//			MessageDialog.openWarning(HandlerUtil.getActiveWorkbenchWindow(event).getShell(), 
//					"warning", "parse failed");
			String info = "Model parse failed!" + "\n";
			info += "Info: \n";
			info += parseException + "\n";
			PalomaConsoleUtils.printConsoleErrorStr(info);
			GlobalManager.clear();	
			
			ISourceProviderService sourceProviderService = (ISourceProviderService) HandlerUtil
			        .getActiveWorkbenchWindow(event).getService(ISourceProviderService.class);
			    // now get my service
			StateSourceProvider commandStateService = (StateSourceProvider) sourceProviderService
			        .getSourceProvider(StateSourceProvider.MY_STATE);
			commandStateService.setState(StateSourceProvider.UNPARSED);
		}	
		return null;
	}

}