package quanticol.ed.ac.uk.paloma.palui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ScrollPaneConstants;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.DefaultCaret;

import quanticol.ed.ac.uk.paloma.realparser.PalomaParser;
import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.framework.PalSimulator;

public class MainFrame extends JFrame implements ActionListener, CaretListener, DocumentListener, ProgressListener{
	private final static int FRAME_WIDTH = 1200;
	private final static int FRAME_HEIGHT = 800;
	
	private final static int Editor_Width = 1200;
	private final static int Editor_Height = 600;
	
	private final static String MAIN_TITLE = "SimPAL";
	
	
	//the main panel
	private JPanel main;
	private	JPanel topPanel;
	private SimPalMenuBar menuBar;
	private JTextArea centerTextArea;
	private JPanel botPanel;
	private JTextArea posTextArea;
	private JTextArea consoleTextArea;
	private JButton clearButton;
	
	File workingFile = null;
	boolean isWorkingFileChanged = false;
	
	public MainFrame() {
		this.setTitle(MAIN_TITLE);
		setSize( FRAME_WIDTH, FRAME_HEIGHT );

		topPanel = new JPanel();
		topPanel.setLayout( new BorderLayout() );
		getContentPane().add( topPanel );

		// Create the menu bar
		menuBar = new SimPalMenuBar(this);

		// Set this instance as the application's menu bar
		setJMenuBar( menuBar );
		
		main = new JPanel();
        main.setSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        main.setBackground(Color.white);
        //main.setLayout(new GridBagLayout());
        main.setLayout(new BorderLayout());
        main.setPreferredSize(new Dimension(FRAME_WIDTH,FRAME_HEIGHT));
        this.getContentPane().add(main);
        
        
        centerTextArea = new JTextArea();
        centerTextArea.setEditable(true);
        //centerTextArea.setLineWrap(true);
        //centerTextArea.setWrapStyleWord(true);
        centerTextArea.setBackground(Color.white);
        centerTextArea.setForeground(Color.black);
        centerTextArea.addCaretListener(this);
        centerTextArea.getDocument().addDocumentListener(this);
        DefaultCaret caret = (DefaultCaret)centerTextArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);

        JScrollPane scroll = new JScrollPane(centerTextArea);
        scroll.setPreferredSize(new Dimension(Editor_Width,Editor_Height));
        main.add(scroll,BorderLayout.CENTER);
        
        initBotPanel();
        
	}
	
	private void initBotPanel() {
		botPanel = new JPanel();
        botPanel.setLayout(new BorderLayout());
        
        consoleTextArea = new JTextArea();
        consoleTextArea.setEditable(false);
        JScrollPane consoleScroll = new JScrollPane(consoleTextArea);
        consoleScroll.setPreferredSize(new Dimension(Editor_Width,200));
        botPanel.add(consoleScroll, BorderLayout.CENTER);
        
        JPanel botSouthPanel = new JPanel();
        botSouthPanel.setPreferredSize(new Dimension(Editor_Width,25));
        botSouthPanel.setLayout(new BorderLayout());
        
        JLabel consoleLabel = new JLabel("Console");
        botSouthPanel.add(consoleLabel, BorderLayout.WEST);
        
        clearButton = new JButton();
        clearButton.setText("clear console");
        clearButton.addActionListener(this);
        botSouthPanel.add(clearButton, BorderLayout.EAST);
        
        botPanel.add(botSouthPanel, BorderLayout.NORTH);
        
        
        posTextArea = new JTextArea();
        posTextArea.setEditable(false);
        posTextArea.setText("Line:"+0 + " Column:"+0);
        botPanel.add(posTextArea, BorderLayout.SOUTH);
        
        main.add(botPanel, BorderLayout.SOUTH);
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == menuBar.getFileNewMenuItem()) {
			if(centerTextArea.getText() != null && !centerTextArea.getText().isEmpty()) { //There is content in textarea
				if(showYesNoDialog("Do you want to save and close current file?", "")) {
					if(workingFile == null) {
						showSaveFileDialog();
					}else {
						//directly save file
						writeCenterTextArea2File(workingFile);
						centerTextArea.setText("");
					}
				}else {
					//do nothing
				}
			}else {
				// do nothing as there is no content in text area
			}
		}if(e.getSource() == menuBar.getFileOpenMenuItem()) {
			if(workingFile != null) {
				//..show do you want to save and close current file dialog
				if(showYesNoDialog("Do you want to save and close current file?", "")) {
					writeCenterTextArea2File(workingFile);
					centerTextArea.setText("");
					showOpenFileDialog();
				}
			}else {
				showOpenFileDialog();
			}
			
		}else if(e.getSource() == menuBar.getFileSaveAsMenuItem()) {
			showSaveFileDialog();
		}else if(e.getSource() == menuBar.getFileSaveMenuItem()) {
			if(workingFile == null) { // show file save dialog
				showSaveFileDialog();
			}else {
				writeCenterTextArea2File(workingFile);
			}
		}else if(e.getSource() == menuBar.getModelParseMenuItem()) {
			String modelStr = centerTextArea.getText();
			if(parseModel(modelStr) == true) {
				menuBar.getModelRunMenuItem().setEnabled(true);
			}else {
				//menuBar.getModelRunMenuItem().setEnabled(false);
			}
		}else if(e.getSource() == clearButton){
			consoleTextArea.setText("");
		}else if(e.getSource() == menuBar.getModelSimulationItem()){
			this.showSimulationOptionPanel();
		}else if(e.getSource() == menuBar.getFileExitItem()){
			if(isWorkingFileChanged && showYesNoDialog("Do you want to save current file?", "")) {
				if(workingFile == null) {
					showSaveFileDialog();
				}else {
					//directly save file
					writeCenterTextArea2File(workingFile);
					centerTextArea.setText("");
				}
			}else {
				centerTextArea.setText("");
			}
		}else if(e.getSource() == menuBar.getPlotMeanItem()) {
			this.showPlotOptionPanel();
		}else if(e.getSource() == menuBar.getPlotVarianceItem()) {
			this.showPlotOptionPanel();
		}else if(e.getSource() == menuBar.getModelODEItem()) {
			this.showOdeOptionPanel(OdeOptionPane.MODE_MOMENTCLOSURE);
		}
		
		System.out.println( e );
		
	}
	


	@Override
	public void caretUpdate(CaretEvent arg0) {
		JTextArea editArea = (JTextArea)arg0.getSource();
        int linenum = 1;
        int columnnum = 1;
        try {
            int caretpos = editArea.getCaretPosition();
            linenum = editArea.getLineOfOffset(caretpos);
            columnnum = caretpos - editArea.getLineStartOffset(linenum);
            // We have to add one here because line numbers start at 0 for getLineOfOffset and we want it to start at 1 for display.
            linenum += 1;
        }
        catch(Exception ex) { }
        // Once we know the position of the line and the column, pass it to a helper function for updating the status bar.
        posTextArea.setText("Line:"+linenum + " Column:"+columnnum);
		
	}
	
	private void readFile2CenterTextArea(File file) {
		FileReader reader = null;
		try {
			reader = new FileReader(file);
            char[] chars = new char[(int) file.length()];
            reader.read(chars);
            String content = new String(chars);
            centerTextArea.setText(content);
            reader.close();
        } catch (IOException exp) {
        	exp.printStackTrace();
        }
	}
	
	private void writeCenterTextArea2File(File file) {
		FileWriter writer = null;
		try {
			writer = new FileWriter(file);
			writer.write(centerTextArea.getText()); 
			writer.flush();
			writer.close();
		} catch (IOException exp) {
			exp.printStackTrace();
		}
	}

	private boolean parseModel(String modelDef) {
		if(modelDef == null || modelDef.length() == 0) {
			consoleTextArea.append("cannot parse empty model! \n");
			return false;
		}
		
		//clear the previous model if there is one
		GlobalManager.clear();
		//model read
		String parseException = "";
		boolean isParseOK = true;
		try {
			PalomaParser parser = new PalomaParser();
			parser.parseFromString(modelDef);
		}catch(Exception parseExp) {
			parseException = parseExp.getMessage();
			isParseOK = false;
		}
		
		if(isParseOK) {
			consoleTextArea.append("The model has been parsed successfully!\n");
			return true;
		}else {
			String info = "Model parse failed!" + "\n";
			info += "Info: \n";
			info += parseException + "\n";
			consoleTextArea.append(info);
			GlobalManager.clear();
			return false;
		}
	}
	
	private void showSimulationOptionPanel(){
		SimDialog sd = new SimDialog(this);
		sd.setLocationRelativeTo(null);
		sd.setVisible(true);
	}
	
	private void showPlotOptionPanel() {
		PlotOptionPane pane = new PlotOptionPane();
		pane.setLocationRelativeTo(null);
		pane.setVisible(true);
	}
	
	private void showOdeOptionPanel(int mode) {
		OdeOptionPane pane = new OdeOptionPane();
		pane.setLocationRelativeTo(null);
		pane.setVisible(true);
	}
	
	private boolean showYesNoDialog(String msg, String title) {
		int reply = JOptionPane.showConfirmDialog(null, msg, title, JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
          return true;
        } else {
           return false;
        }
	}
	
	private void showSaveFileDialog() {
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            writeCenterTextArea2File(file);
            workingFile = file;
            isWorkingFileChanged = false;
            System.out.println("Saving to: " + file.getAbsolutePath() );
        } else {
        	System.out.println("Save as command cancelled by user." );
        }
	}
	
	private void showOpenFileDialog(){
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(this);
		if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            System.out.println("Opening: " + file.getAbsolutePath() );
            readFile2CenterTextArea(file);
            workingFile = file;
            isWorkingFileChanged = false;
        } else {
        	System.out.println("Open command cancelled by user." );
        }
	}

	@Override
	public void changedUpdate(DocumentEvent arg0) {
		
	}

	@Override
	public void insertUpdate(DocumentEvent arg0) {
		isWorkingFileChanged = true;
	}

	@Override
	public void removeUpdate(DocumentEvent arg0) {
		isWorkingFileChanged = true;
		
	}

	@Override
	public void notifyProgress(String info) {
		consoleTextArea.append(info + "\n");
		if(info.equals(ProgressListener.START)) {
			//this.menuBar.getPlotMeanItem().setEnabled(false);
			//this.menuBar.getPlotVarianceItem().setEnabled(false);
		}else if(info.equals(ProgressListener.COMPLETE)){
			this.menuBar.getPlotMeanItem().setEnabled(true);
			this.menuBar.getPlotVarianceItem().setEnabled(true);
		}
	}

}
