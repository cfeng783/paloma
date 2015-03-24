package org.xtext.edinburgh.ui;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;

import quanticol.ed.ac.uk.paloma.palui.OdeOptionPane;

public class ExportOdeHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		OdeOptionPane pane = new OdeOptionPane();
		pane.setLocationRelativeTo(null);
		pane.setVisible(true);
		return null;
	}

}
