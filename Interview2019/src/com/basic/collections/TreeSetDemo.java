package com.basic.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// Sorted collections
		//Elements in ascending order
		
		TreeSet<String> names= new TreeSet<String>( );
		names.add("fruits");
		names.add("cherry");
		names.add("pineapple");
		names.add("pineapple");
		names.add("pineapple");		
		System.out.println(names);	
	}
}
