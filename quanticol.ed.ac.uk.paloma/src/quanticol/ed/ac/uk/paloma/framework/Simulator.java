package quanticol.ed.ac.uk.paloma.framework;


class Simulator extends AbstractSimulator {
    double time;
    double final_time;
    double now() {
        return time;
    }
    void doAllEvents() {
        Event e;
        while ( (e= (Event) events.removeFirst()) != null) {
            if(e.time > final_time) {
            	//System.out.println("next event time: "+e.time);
            	break;
            }
        	time = e.time;
            e.execute(this);
        }
    }
    
}