package quanticol.ed.ac.uk.paloma.palui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.odedecompose.MomentScripter;

@SuppressWarnings("serial")
public class OdeOptionPane extends JFrame implements ActionListener, ItemListener{
	public final static int MODE_MOMENTCLOSURE = 1001;
	
	private final static String TITLE_MOMENTCLOSURE = "ODE export options";
	private final static int FRAME_WIDTH = 750;
	private final static int FRAME_HEIGHT = 300;
	
	private JTextField inputField;
	private JButton addBtn;
	private JPanel centerPanel;
	JComboBox modeList;
	private JComboBox stList;
	private JComboBox locList;
	
	private ArrayList<JLabel> stateFields = new ArrayList<JLabel>();
	private ArrayList<JButton> deleteButtons = new ArrayList<JButton>();
	
	private JButton cancelBtn;
	private JButton plotBtn;
	
	//JTextField finalTimeField;
	
	public OdeOptionPane(){
		this.setTitle(TITLE_MOMENTCLOSURE);
		
		setSize( FRAME_WIDTH, FRAME_HEIGHT );
		
		JPanel main = new JPanel();
		main.setLayout( new BorderLayout() );
		getContentPane().add( main );
		
		
		JPanel topPanel = new JPanel();
		topPanel.setLayout(new GridLayout(2,1));		
		JPanel topUpPanel = new JPanel();
		
		topUpPanel.add(new JLabel("State:"));
		ArrayList<String> stArray = new ArrayList<String>();
		HashMap<String, Integer> tempMap = new HashMap<String, Integer>();
		for(String key: GlobalManager.getStateManager().getStateMap().keySet()) {
			State st = GlobalManager.getStateManager().getStateMap().get(key);
			if(tempMap.get(st.getName()) == null) {
				tempMap.put(st.getName(), 1);
				stArray.add(st.getName());
			}
		}
		String[] stStrings = new String[stArray.size()];
		for(int i=0; i<stStrings.length; i++) {
			stStrings[i] = stArray.get(i);
		}
		stList = new JComboBox(stStrings);
		stList.setSelectedIndex(0);
		stList.addItemListener(this);
		topUpPanel.add(stList);
		
		topUpPanel.add(Box.createHorizontalStrut(15));
		
		topUpPanel.add(new JLabel("Location:"));
		String[] locStrings = new String[GlobalManager.getLocationManager().getLocMap().size()];
		int i = 0;
		for(String key: GlobalManager.getLocationManager().getLocMap().keySet()) {
			Loc loc = GlobalManager.getLocationManager().getLocMap().get(key);
			locStrings[i] = "("+loc.getKey()+")";
			i++;
		}
		locList = new JComboBox(locStrings);
		locList.setSelectedIndex(0);
		locList.addItemListener(this);
		topUpPanel.add(locList);
		
		topPanel.add(topUpPanel);
		
		JPanel topDownPanel = new JPanel();

		topDownPanel.add(new JLabel("Agent state to plot:"));
		
		inputField = new JTextField();
		inputField.setPreferredSize(new Dimension(250,40));
		inputField.setText(stStrings[0] + locStrings[0]);
		topDownPanel.add(inputField);
		topDownPanel.add(Box.createHorizontalStrut(15)); // a spacer
		
		addBtn = new JButton("add");
		addBtn.addActionListener(this);
		topDownPanel.add(addBtn);
		
		topPanel.add(topDownPanel);
		
		
		
//		topPanel.add(new JLabel("Enter states of interest:"));
//		
//		inputField = new JTextField();
//		inputField.setPreferredSize(new Dimension(250,40));
//		topPanel.add(inputField);
//		topPanel.add(Box.createHorizontalStrut(5)); // a spacer
//		
//		addBtn = new JButton("add");
//		addBtn.addActionListener(this);
//		topPanel.add(addBtn);
		
		main.add(topPanel, BorderLayout.NORTH);
		
		centerPanel = new JPanel();
		main.add(centerPanel, BorderLayout.CENTER);
		centerPanel.setPreferredSize(new Dimension(300,100));
		initCenterPanel();
		
		JPanel botPanel = new JPanel();
		cancelBtn = new JButton("cancel");
		botPanel.add(cancelBtn);
		cancelBtn.addActionListener(this);
		
		plotBtn = new JButton("export");
		botPanel.add(plotBtn);
		plotBtn.addActionListener(this);
		
		main.add(botPanel, BorderLayout.SOUTH);
	}
	
	private void initCenterPanel() {
		String[] modeStrings = { "Full Script", "Reduction Beyond 3-hop", "Reduction Beyond 2-hop", "Reduction Beyond 1-hop"};
		modeList = new JComboBox(modeStrings);
		modeList.setSelectedIndex(0);
		centerPanel.add(modeList);
		//centerPanel.add(Box.createHorizontalStrut(15)); 
		
		ArrayList<String> plotVars = GlobalManager.getPlotVarDefiner().getPlotVars();
		for(int i=0; i<plotVars.size(); i++) {
			JLabel textfield = new JLabel();
			textfield.setText(plotVars.get(i));
			stateFields.add(textfield);
			centerPanel.add(textfield);
			
			JButton btn = new JButton("delete");
			deleteButtons.add(btn);
			btn.addActionListener(this);
			centerPanel.add(btn);
			centerPanel.validate();
			centerPanel.repaint();
		}
		
	}
	
	private String[] getInputStates(){
		String input = inputField.getText();
		if(input == null || input.isEmpty()) {
			return null;
		}
		String[] vars = input.split("&");
		return vars;
	}
	
    private void writeOdeScriptsToFile(ArrayList<String> odes, ArrayList<String> fmscripts, ArrayList<String> smscripts, String dir) throws IOException {
		//PrintWriter sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream("~/Dropbox/Spatial PEPA/fluidflow.m")),true); 
		PrintWriter sw = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dir + File.separator + "fluidflow.m")),true);  
		for(String str: odes) {
			//System.out.println(str);
			sw.println(str);
		}
		sw.close();
		
		PrintWriter sw2 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dir + File.separator + "firstMoment.m")),true);  
		for(String str: fmscripts) {
			//System.out.println(str);
			sw2.println(str);
		}
		sw2.close();
		
		PrintWriter sw3 = new PrintWriter(new OutputStreamWriter(new FileOutputStream(dir + File.separator + "secondMoment.m")),true);  
		for(String str: smscripts) {
			//System.out.println(str);
			sw3.println(str);
		}
		sw3.close();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == addBtn) {
			String[] vars = getInputStates();
			if(vars == null) {
				JOptionPane.showMessageDialog(null, "no state to add!");
				return;
			}
			for(String var: vars) {
				if(GlobalManager.getStateManager().getState(var) == null) {
					JOptionPane.showMessageDialog(null, var + " is not a state!");
					return;
				}
			}
			ArrayList<String> states = new ArrayList<String>();
			for(String var: vars) {
				boolean needAdd = true;
				for(String str: GlobalManager.getPlotVarDefiner().getPlotVars()) {
					if(var.equals(str)) {
						needAdd = false;
					}
				}
				if(needAdd)
					states.add(var);
			}
			
			if(states.size() + GlobalManager.getPlotVarDefiner().getPlotVars().size() > 14) {
				JOptionPane.showMessageDialog(null, "sorry, we can plot at most 14 states on an image!");
				return;
			}
			
			GlobalManager.getPlotVarDefiner().insertPlotVars(states);
			//System.out.println(states.size()+"");
			for(int i=0; i<states.size(); i++) {
				JLabel textfield = new JLabel();
				textfield.setText(states.get(i));
				stateFields.add(textfield);
				centerPanel.add(textfield);
				
				JButton btn = new JButton("delete");
				deleteButtons.add(btn);
				btn.addActionListener(this);
				centerPanel.add(btn);
			}
			centerPanel.validate();
			centerPanel.repaint();
			
		} else if(arg0.getSource() == cancelBtn) {
			this.dispose();
		} else if(arg0.getSource() == plotBtn) {
			final JFileChooser fc = new JFileChooser();
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			int returnVal = fc.showSaveDialog(this);
			if (returnVal == JFileChooser.APPROVE_OPTION) {
	           File dir = fc.getCurrentDirectory();
	           //System.out.println(dir.getAbsolutePath());
	           int threshold = -1;
	           switch(modeList.getSelectedIndex()) {
	           		case 0: threshold = 1000;
	           		case 1: threshold = 3;
	           		case 2: threshold = 2;
	           		case 3: threshold = 1;
	           }
	           
	           MomentScripter odeScripter = new MomentScripter(GlobalManager.getStateManager().getStateMap(), threshold);
			   ArrayList<String> odes = odeScripter.genOdes();
			
			   ArrayList<String> FirstScripts = odeScripter.genMatlabScript(MomentScripter.FIRST_MOMENT,
					   100, GlobalManager.getPlotVarDefiner().getPlotVars());
			   ArrayList<String> SecondScripts = odeScripter.genMatlabScript(MomentScripter.SECOND_MOMENT,
					   100, GlobalManager.getPlotVarDefiner().getPlotVars());
			   try {
					writeOdeScriptsToFile(odes, FirstScripts, SecondScripts, dir.getAbsolutePath());
			   }catch(IOException e) {
					e.printStackTrace();
		       }
			   JOptionPane.showMessageDialog(null, "matlab scripts generated under directory \"" + dir.getAbsolutePath() + "/\"");
	           this.dispose();
	        } else {
	        	//System.out.println("Save as command cancelled by user." );
	        }
	        
		} else {
			for(int i=0; i<deleteButtons.size(); i++) {
				if(arg0.getSource()==deleteButtons.get(i)) {
					GlobalManager.getPlotVarDefiner().getPlotVars().remove(i);
					centerPanel.remove(stateFields.get(i));
					centerPanel.remove(deleteButtons.get(i));
					centerPanel.validate();
					centerPanel.repaint();
					stateFields.remove(i);
					deleteButtons.remove(i);
				}
			}
		}
		
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		// TODO Auto-generated method stub
		String stString = stList.getSelectedItem().toString();
		String locString = locList.getSelectedItem().toString();
		
		inputField.setText(stString + locString);
	}
}
