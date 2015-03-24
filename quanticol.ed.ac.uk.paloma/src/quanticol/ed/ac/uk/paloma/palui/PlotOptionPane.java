package quanticol.ed.ac.uk.paloma.palui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import quanticol.ed.ac.uk.paloma.facility.ploter;
import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.model.Loc;
import quanticol.ed.ac.uk.paloma.model.State;

@SuppressWarnings("serial")
public class PlotOptionPane extends JFrame implements ActionListener, ItemListener{
	
	private final static String TITLE = "Plot Simulation Trajectory";
	private final static int FRAME_WIDTH = 700;
	private final static int FRAME_HEIGHT = 300;
	
	private JTextField inputField;
	private JButton addBtn;
	private JPanel centerPanel;
	private JComboBox modeList;
	private JComboBox stList;
	private JComboBox locList;
	private ArrayList<JLabel> stateFields = new ArrayList<JLabel>();
	private ArrayList<JButton> deleteButtons = new ArrayList<JButton>();
	
	private JButton cancelBtn;
	private JButton plotBtn;
	
	public PlotOptionPane(){
		this.setTitle(TITLE);
		setSize( FRAME_WIDTH, FRAME_HEIGHT );
		
		JPanel main = new JPanel();
		main.setLayout( new BorderLayout() );
		getContentPane().add( main );
		
		
		JPanel topPanel = new JPanel();
		
		
		
		//JPanel topRightPanel = new JPanel();
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
		
	//	topPanel.add(topRightPanel);
//		topPanel.add(Box.createHorizontalStrut(15)); // a spacer
//		
//		topPanel.add(new JLabel("Enter states to plot:"));
//		
//		inputField = new JTextField();
//		inputField.setPreferredSize(new Dimension(250,40));
//		topPanel.add(inputField);
//		topPanel.add(Box.createHorizontalStrut(15)); // a spacer
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
		
		plotBtn = new JButton("plot");
		botPanel.add(plotBtn);
		plotBtn.addActionListener(this);
		
		main.add(botPanel, BorderLayout.SOUTH);
	}
	
	private void initCenterPanel() {
		
		String[] modeStrings = { "Mean", "Variance"};
		modeList = new JComboBox(modeStrings);
		modeList.setSelectedIndex(0);
		centerPanel.add(modeList);
		
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
			ploter p = new ploter();
			String[] plots = GlobalManager.getPlotVarDefiner().getPlots();
        	if(this.modeList.getSelectedIndex()==0) {
        		p.plot(plots);
        	}else {
        		p.plotVariance(plots);
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
		String stString = stList.getSelectedItem().toString();
		String locString = locList.getSelectedItem().toString();
		
		inputField.setText(stString + locString);
	}
}
