package com.basic.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		
		Vector<String> names = new Vector <String>();
		names.add("apple");
		names.add("cherry");
		names.add("cherry");
		names.add("cherry");
		names.add(null);
		
		System.out.println(names);	

	}

}
