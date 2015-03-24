/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package quanticol.ed.ac.uk.paloma.facility;

/**
 * A class used to store a single XY trajectory, containing the data and the name of the
 * traectory. It is used by the ExploratorDataProcessor to generate trajectories in the parameter space.
 * @author Luca, Cheng
 */
public class Plot2DTrajectory {
    public String name;
    public double [] x;
    public double [] y;

    public Plot2DTrajectory(String name, double[] x, double[] y) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

}
