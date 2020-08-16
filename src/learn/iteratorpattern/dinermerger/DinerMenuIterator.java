package learn.iteratorpattern.dinermerger;

public class DinerMenuIterator implements Iterator {
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

}
