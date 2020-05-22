package com.sachin.collections;

public class Test {

	public static void main(String[] args) {

		LinkedList l = new LinkedList();

		l.add(12);
		l.add(5);
		l.add(35);
		
		System.out.print(l.size());
		l.remove(1);
		System.out.println(l.size());

	}

}
