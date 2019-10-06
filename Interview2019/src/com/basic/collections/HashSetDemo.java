package com.basic.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//no duplicates
		//null allowsed
		//Unordered and Unsorted
		
		HashSet<String> names = new HashSet<String>();
		names.add("Cherry");
		names.add("Cherry");
		names.add("Cherry");
		names.add("apple");
		names.add("mango");
		names.add(null);
		System.out.println(names);		

	}

}
