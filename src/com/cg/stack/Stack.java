package com.cg.stack;

public interface Stack<X> {
	public void push(X item);
	public X pop();
	public boolean contains(X searchItem);
	public X access(X accessItem);
	public int size();
}
