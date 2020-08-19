package com.cg.stack;

public class BasicStackTest {

	public static void main(String[] args) {
		Stack<String> stackImpl = new BasicStackImpl();
		stackImpl.push("Pankaj");
		stackImpl.push("Ajay");
		stackImpl.push("Aamir");
		stackImpl.push("Manu");
		stackImpl.push("Himanshu");

		String str = stackImpl.pop();
		System.out.println(str);

		// search
		System.out.println(stackImpl.contains("Aamir"));
		System.out.println(stackImpl.contains("Bhati"));

		// size
		System.out.println(stackImpl.size());

		// access
		String item = stackImpl.access("Ajay");
		System.out.println(item);
	}

}
