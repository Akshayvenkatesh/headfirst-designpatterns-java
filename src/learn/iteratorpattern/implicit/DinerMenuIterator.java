package learn.iteratorpattern.implicit;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] items;
	int position = 0;

	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.items.length || this.items[this.position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = items[this.position];
		this.position = this.position + 1;
		return menuItem;
	}

	@Override
	public void remove() {
		if (position <= 0) {
			throw new IllegalStateException("You can’t remove an item until you’ve done at least one next()");
		}
		if (this.items[this.position - 1] != null) {
			for (int i = this.position - 1; i < this.items.length - 1; i++) {
				this.items[i] = this.items[i + 1];
			}
			this.items[this.items.length - 1] = null;
		}
	}

}
