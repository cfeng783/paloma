package quanticol.ed.ac.uk.paloma.palui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.framework.PalSimulator;

@SuppressWarnings("serial")
public class SimDialog extends JFrame implements ActionListener{
	private final static String TITLE = "Simulation Options";
	private final static int FRAME_WIDTH = 650;
	private final static int FRAME_HEIGHT = 100;
	
	private JPanel main;
	JTextField rtField;
	JTextField stField;
	JButton cancelBtn;
	JButton startBtn;
	
	ProgressListener progressListener;
	
	public SimDialog(ProgressListener progressListener){
		
		this.progressListener = progressListener;
		
		this.setTitle(TITLE);
		setSize( FRAME_WIDTH, FRAME_HEIGHT );
		
		main = new JPanel();
		main.setLayout( new BorderLayout() );
		getContentPane().add( main );
		
		rtField = new JTextField();
		rtField.setPreferredSize(new Dimension(100,30));
		stField = new JTextField();
		stField.setPreferredSize(new Dimension(100,30));
		
		
		JPanel centerPanel = new JPanel();
		centerPanel.add(new JLabel("Number of Runs:"));
		centerPanel.add(rtField);
		centerPanel.add(Box.createHorizontalStrut(15)); // a spacer
		centerPanel.add(new JLabel("Stop time:"));
		centerPanel.add(stField);
		
		main.add(centerPanel, BorderLayout.CENTER);
		
		JPanel botPanel = new JPanel();
		cancelBtn = new JButton("cancel");
		cancelBtn.addActionListener(this);
		startBtn = new JButton("start simulation");
		startBtn.addActionListener(this);
		botPanel.add(cancelBtn);
		centerPanel.add(Box.createHorizontalStrut(90));
		botPanel.add(startBtn);
		
		main.add(botPanel, BorderLayout.SOUTH);
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == cancelBtn) {
			this.dispose();
		}else if(arg0.getSource() == startBtn) {
			String strRunTimes = rtField.getText();
			String strStopTime = stField.getText();
			
			if(strRunTimes == null || strRunTimes.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please enter number of runs before starting simulation!");
				return;
			}
			
			if(strStopTime == null || strStopTime.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Please specify stop time before starting simulation!");
				return;
			}
			
			int runTimes = -1;
			double stopTime = -1;
			try{
				runTimes = Integer.parseInt(strRunTimes);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Number of runs must be a positive integer!");
				return;
			}
			
			if(runTimes <=0) {
				JOptionPane.showMessageDialog(null, "Number of runs must be a positive integer!");
				return;
			}
			
			try{
				stopTime = Double.parseDouble(strStopTime);
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "Stop time must be a positive number!");
				return;
			}
			
			if(stopTime <=0) {
				JOptionPane.showMessageDialog(null, "Stop time must be a positive number!");
				return;
			}
			GlobalManager.clearCounter();
			GlobalManager.initializeCounter(stopTime, runTimes);
			
			progressListener.notifyProgress(ProgressListener.START);
			
			this.dispose();
		}
		
	}
}
