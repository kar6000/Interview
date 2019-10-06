package com.basic.collections;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// Maintains insertion order.
		//Slower than Hash map.
		//Can expect a faster iteration
		
		LinkedHashMap<String,String> names =new LinkedHashMap<String,String>( );
		names.put("key1", "apples");
		names.put("key2","oranges");
		names.put("key2","oranges");
		names.put("key3","oranges");
		names.put(null,null);
		System.out.println(names);		

	}

}
