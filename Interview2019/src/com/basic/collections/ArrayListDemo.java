package com.basic.collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//Accept duplicates, null
		
		ArrayList <String> names = new ArrayList<String>();
		names.add("apple");
		names.add("orange");
		names.add("banana");
		names.add("Lychee");
		names.add("Lychee");
		names.add("mangos");
		names.add(null);
		names.add(2, "Ipsita");
		
		System.out.println(names);

	}

}
