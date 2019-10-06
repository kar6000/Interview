package com.basic.collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// Doesn’t allow anything that is null.
		//no duplicates
		Hashtable<String,String> names =new Hashtable<String,String>( );
		names.put("key1", "Cherry");
		names.put("key2", "banana");
		names.put("key3", "pineapple");
		names.put("key3", "pineapple");
		names.put("key3", "pineapple");
		//names.put(null, null);	
		System.out.println(names);
	}

}
