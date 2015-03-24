package quanticol.ed.ac.uk.paloma.framework;

abstract class  AbstractEvent implements Comparable {
    abstract void execute(AbstractSimulator simulator);
}