package learn.iteratorpattern.dinermergecafe;

import java.util.Calendar;
import java.util.Iterator;

public class AlternatingDinerMenuIterator implements Iterator<MenuItem> {

	MenuItem[] menuItems;
	int position;

	public AlternatingDinerMenuIterator(MenuItem[] items) {
		this.menuItems = items;
		Calendar rightNow = Calendar.getInstance();
		this.position = rightNow.get(Calendar.DAY_OF_WEEK) % 2;
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.menuItems.length || this.menuItems[this.position] == null) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = this.menuItems[this.position];
		this.position = this.position + 2;
		return menuItem;
	}

	public void remove() {
		throw new UnsupportedOperationException("Alternating Diner Menu Iterator does not support remove()");
	}

}
