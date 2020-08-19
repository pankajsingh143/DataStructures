package com.cg.stack;

import java.util.Arrays;

public class BasicStackImpl<X> implements Stack<X> {

	private X[] ar = (X[]) new Object[5];
	private int index = 0;

	public void push(X item) {
		ar[index++] = item;

		System.out.println(Arrays.toString(ar));

	}

	public X pop() {
		if (index == 0)
			throw new IllegalArgumentException("No items to pop");
		return ar[--index];
	}

	public int size() {
		int sizeOfStack = 0;
		return index;
	}

	public boolean contains(X searchItem) {
		boolean itemFound = false;
		for (X item : ar) {
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
