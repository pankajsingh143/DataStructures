package com.cg.stack;

import java.util.ArrayList;
import java.util.List;

public class ListStackImpl<X> implements Stack<X> {

	private List<X> list = new ArrayList<>();
	private int index = 0;

	public void push(X item) {
		list.add(index++, item);

		System.out.println(list);

	}

	public X pop() {
		if (index == 0)
			throw new IllegalArgumentException("No items to pop");
		return list.get(--index);
	}

	public int size() {
		int sizeOfStack = 0;
		return index;
	}

	public boolean contains(X searchItem) {
		boolean itemFound = false;
		for (X item : list) {
			if (item.equals(searchItem)) {
				itemFound = true;
				break;
			}
		}
		return itemFound;
	}

	public X access(X item) {
		X itemToAccess = null;
		while (index > 0) {
			itemToAccess = pop();
			if (itemToAccess.equals(item)) {
				break;
			}
		}
		if (itemToAccess == null)
			throw new IllegalArgumentException("Item not found");
		return itemToAccess;
	}

}
