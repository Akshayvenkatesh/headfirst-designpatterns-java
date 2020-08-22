package learn.compositepattern.menuiterator;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public MenuComponent next() {
		return null;
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
