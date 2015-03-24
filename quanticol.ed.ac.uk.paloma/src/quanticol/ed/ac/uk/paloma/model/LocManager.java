package quanticol.ed.ac.uk.paloma.model;

import java.util.HashMap;

import quanticol.ed.ac.uk.paloma.utality.Utality;

public class LocManager {
	HashMap<String, Loc> locMap = new HashMap<String, Loc>();
	
	public void addLoc(Loc loc) {
		if(locMap.get(loc.getKey()) == null) {
			locMap.put(loc.getKey(), loc);
		}
	}
	
	public HashMap<String, Loc> evalMsgRange(Loc currentLoc, String rangeExp) {
		HashMap<String, Loc> ret = new HashMap<String, Loc>();
		rangeExp = rangeExp.trim();
		if(rangeExp.equals(ConstExp.local))  {
			ret.put(currentLoc.getKey(), currentLoc);
		}else if(rangeExp.equals(ConstExp.all)) {
			ret = locMap;
		}else if(rangeExp.contains(ConstExp.range)) {
			int startIndex = rangeExp.indexOf("range(") + 6;
			int endIndex = rangeExp.lastIndexOf(")");
			String distString = rangeExp.substring(startIndex, endIndex);
			double dist = Utality.evalParamExpressionForSimulation(distString);
			for(String key: locMap.keySet()) {
				Loc loc = locMap.get(key);
				if(calDist(currentLoc, loc) <= dist) {
					ret.put(key, loc);
				}
			}
		}else {
			String[] locStrs = rangeExp.split(",");
			int x = 0;
			int y = 0;
			for(int i=0; i<locStrs.length; i++) {
				String str = locStrs[i];
				if(str.indexOf('(') != -1) {
					str = str.substring(str.indexOf('(') + 1);
				}else {
					str = str.substring(0, str.indexOf(')'));
				}
				if(i % 2 == 0) {
					x = Integer.parseInt(str);
				}else {
					y = Integer.parseInt(str);
					String locKey = x+","+y;
					Loc loc = locMap.get(locKey);
					if(loc != null) {
						ret.put(locKey, loc);
					}
				}
			}
		}
		return ret;
	}
	
	public double calDist(Loc l1, Loc l2) {
		return Math.sqrt(Math.pow(l1.x-l2.x, 2) + Math.pow(l1.y-l2.y, 2));
	}
	
	public HashMap<String, Loc> getLocMap() {
		return locMap;
	}
	
	public void clear() {
		this.locMap.clear();
	}
	
	
	
}
