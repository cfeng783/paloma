package quanticol.ed.ac.uk.paloma.model;

//location
public class Loc {
	public int x;
	public int y;
	
	public Loc(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String getKey() {
		return x+","+y;
	}
	
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
}
