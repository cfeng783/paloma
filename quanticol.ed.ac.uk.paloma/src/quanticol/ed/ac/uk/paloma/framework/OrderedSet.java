package quanticol.ed.ac.uk.paloma.framework;

abstract class OrderedSet {
	abstract void insert(Comparable x);
    abstract Comparable  removeFirst();
    abstract int size();
    abstract Comparable remove(Comparable x);
    abstract void clear();
}
