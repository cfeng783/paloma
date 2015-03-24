package quanticol.ed.ac.uk.paloma.palui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFileChooser;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;

public class SimPalMenuBar extends JMenuBar {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int	ITEM_PLAIN	=	0;	// Item types
	private final int	ITEM_CHECK	=	1;
	private final int	ITEM_RADIO	=	2;

	private	JMenu		menuFile;
	private JMenu	menuModel;
	private JMenuItem menuParse;
	private JMenu menuRun;
	private JMenuItem menuSimulate;
	private JMenuItem menuODE;
	private	JMenuItem	menuFileNew;
	private	JMenuItem	menuFileOpen;
	private	JMenuItem	menuFileSave;
	private	JMenuItem	menuFileSaveAs;
	private	JMenuItem	menuFileExit;
	private JMenu menuTrajectory;
	private JMenuItem menuPlotPpl;
	private JMenuItem menuPlotVariance;
	
	
	private ActionListener listener;

	public SimPalMenuBar(ActionListener listener)
	{
		
		this.listener = listener;
		
		// Create the file menu
		menuFile = new JMenu( "File" );
		menuFile.setMnemonic( 'F' );
		this.add( menuFile );

		// Create the file menu
		// Build a file menu items
		menuFileNew = CreateMenuItem( menuFile, ITEM_PLAIN,
								"New", null, 'N', null );
		menuFileOpen = CreateMenuItem( menuFile, ITEM_PLAIN, "Open...",
								null, 'O',
								"Open a new file" );
		menuFileSave = CreateMenuItem( menuFile, ITEM_PLAIN, "Save",
								null, 'S',
								" Save this file" );
		menuFileSaveAs = CreateMenuItem( menuFile, ITEM_PLAIN,
								"Save As...", null, 'A',
								"Save this data to a new file" );
		// Add the property menu
		//menuFile.addSeparator();
		//menuFile.add( menuProperty );	
		//menuFile.addSeparator();
		menuFileExit = CreateMenuItem( menuFile, ITEM_PLAIN,
								"Exit", null, 'x',
								"Exit the program" );

		menuModel = new JMenu( "Model" );
		this.add(menuModel);
		menuParse = CreateMenuItem( menuModel, ITEM_PLAIN, "Parse", null, 'p', "parse model" );
		
		menuRun = new JMenu("Run");	
		//menuRun.setEnabled(false);
		menuModel.add(menuRun);
		menuSimulate = CreateMenuItem( menuRun, ITEM_PLAIN, "Simulation", null, 'r', "run simulation" );
		menuODE = CreateMenuItem( menuRun, ITEM_PLAIN, "ODE", null, 'r', "mean-field analysis" );
		
		menuTrajectory = new JMenu( "Trajectory" );
		this.add(menuTrajectory);
		
		menuPlotPpl = CreateMenuItem( menuTrajectory, ITEM_PLAIN, "Mean", null, 'p', "plot mean population trajectory" );
		menuPlotVariance = CreateMenuItem( menuTrajectory, ITEM_PLAIN, "Variance", null, 'p', "plot variance trajectory" );
		//menuPlotPpl.setEnabled(false);
		//menuPlotVariance.setEnabled(false);
		
	}

	public JMenuItem CreateMenuItem( JMenu menu, int iType, String sText,
								ImageIcon image, int acceleratorKey,
								String sToolTip )
	{
		// Create the item
		JMenuItem menuItem;

		switch( iType )
		{
			case ITEM_RADIO:
				menuItem = new JRadioButtonMenuItem();
				break;

			case ITEM_CHECK:
				menuItem = new JCheckBoxMenuItem();
				break;

			default:
				menuItem = new JMenuItem();
				break;
		}

		// Add the item test
		menuItem.setText( sText );

		// Add the optional icon
		if( image != null )
			menuItem.setIcon( image );

		// Add the accelerator key
		if( acceleratorKey > 0 )
			menuItem.setMnemonic( acceleratorKey );

		// Add the optional tool tip text
		if( sToolTip != null )
			menuItem.setToolTipText( sToolTip );

		// Add an action handler to this menu item
		menuItem.addActionListener( listener );

		menu.add( menuItem );

		return menuItem;
	}

	public JMenuItem getFileOpenMenuItem() {
		return menuFileOpen;
	}
	
	public JMenuItem getModelParseMenuItem() {
		return menuParse;
	}
	
	public JMenuItem getFileSaveMenuItem() {
		return menuFileSave;
	}
	
	public JMenuItem getFileSaveAsMenuItem() {
		return menuFileSaveAs;
	}
	
	public JMenuItem getFileNewMenuItem() {
		return menuFileNew;
	}
	
	public JMenuItem getModelRunMenuItem() {
		return menuRun;
	}
	
	public JMenuItem getModelSimulationItem() {
		return menuSimulate;
	}
	
	public JMenuItem getModelODEItem() {
		return menuODE;
	}
	
	public JMenuItem getFileExitItem() {
		return menuFileExit;
	}
	
	public JMenuItem getPlotMeanItem() {
		return menuPlotPpl;
	}
	
	public JMenuItem getPlotVarianceItem() {
		return menuPlotVariance;
	}
}
