package quanticol.ed.ac.uk.paloma.framework;

public class AbstractSimulator {
	OrderedSet events;
	
	void insert(AbstractEvent e) {
	    events.insert(e);
	}

	void cancel(AbstractEvent e)  {
		events.remove(e);
	}
}
