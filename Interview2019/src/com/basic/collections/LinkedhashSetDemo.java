package com.basic.collections;

import java.util.LinkedHashSet;

public class LinkedhashSetDemo {

	public static void main(String[] args) {
		//An ordered version of the hash set is known as Linked Hash Set.
		//Maintains a doubly-Linked list of all the elements.
		//Use this when the iteration order is required.
		
		LinkedHashSet<String> names = new LinkedHashSet<String>();
		names.add("banana");
		names.add("Cherry");
		names.add("apple");
		names.add("banana");
		names.add(null);
		System.out.println(names);		

	}

}
