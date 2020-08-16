package learn.iteratorpattern.dinermerger;

import java.util.List;

public class PancakeHouseIterator implements Iterator {
	List<MenuItem> items;
	int position;

	public PancakeHouseIterator(List<MenuItem> items) {
		this.items = items;
	}

	@Override
	public boolean hasNext() {
		if (this.position >= this.items.size()) {
			return false;
		} else {
			return true;
		}
	}

	@Override
	public MenuItem next() {
		MenuItem menuItem = this.items.get(this.position);
		this.position = this.position + 1;
		return menuItem;
	}

}
