package quanticol.ed.ac.uk.paloma.model.action;

import java.util.ArrayList;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;


public class PropensityFunc {
    private String stateID;
    private Action action;
    private double rate;
    private double internalRate;
    
    //only for unicast to check if there is a potential receiver in the system currently
    private ArrayList<String> potentialReceivers;
    
    public PropensityFunc(String stateID, Action action, double internalRate) {
        this.stateID = stateID;
        this.action = action;
        this.internalRate = internalRate;
    }
    
    public String getStateID() {
        return stateID;
    }
    public void setStateID(String stateID) {
        this.stateID = stateID;
    }
    public Action getAction() {
        return action;
    }
    public void setActionIndex(Action action) {
        this.action = action;
    }
    public double getApparentRate() {
        return rate;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    
    public double getInternalRate() {
        if(potentialReceivers == null) {
            return internalRate;
        }else {
            for(String stateID: potentialReceivers) {
                if(GlobalManager.getAgentList().get(stateID).getCount() > 0) {
                    return internalRate;
                }
            }
            return 0;
        }
    }
    
    public void setPotentialReceivers(ArrayList<String> potentialReceivers) {
        this.potentialReceivers = potentialReceivers;
    }
}
