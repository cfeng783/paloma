package quanticol.ed.ac.uk.paloma.palui;

import quanticol.ed.ac.uk.paloma.utality.Utality;
import quanticol.ed.ac.uk.paloma.framework.GlobalManager;

public class SimPalUI {
	public static void main(String[] args) {
		Utality.init();
		GlobalManager.init();
	
		MainFrame mf = new MainFrame();
		mf.setLocationRelativeTo(null);
		mf.setVisible(true);
		
	}
}
