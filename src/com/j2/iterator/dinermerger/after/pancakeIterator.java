package com.j2.iterator.dinermerger.after;
import java.util.*;

public class pancakeIterator implements Iterator {
	ArrayList menuItems;
	int position;

	pancakeIterator(ArrayList menuItems) {
		this.menuItems = menuItems;
		position = 0;
	}

	@Override
	public boolean hasNext() {
		if (position >= menuItems.size())
			return false;
		else
			return true;
	}

	@Override
	public Object Next() {
		MenuItem menuItem = (MenuItem) menuItems.get(position++);
		return menuItem;
	}

}
