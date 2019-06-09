package iterator_pattern;

import java.util.ArrayList;

public class PancakeMenuIterator implements Iterator {
	ArrayList<MenuItem> items;
	int position = 0;

	public PancakeMenuIterator(ArrayList<MenuItem> items) {
		this.items = items;
	}

	public Object next() {
		MenuItem menuItem = items.get(position);
		position = position + 1;
		return menuItem;
	}

	public boolean hasNext() {
		if (position >= items.size()) {
			return false;
		} else {
			return true;
		}
	}
}
