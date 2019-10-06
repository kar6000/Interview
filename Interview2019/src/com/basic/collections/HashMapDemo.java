package com.basic.collections;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		
		//Unordered and unsorted map.
		//Hashmap is a good choice when we don’t care about the order.
		//It allows one null key and multiple null values.
		
		HashMap<String,String> names =new HashMap<String,String>( );
		names.put("key1", "Ipsita");
		names.put("key2", "Apples");
		names.put("key3", "banana");
		names.put("key4", "fruits");
		names.put(null, null);
		names.put(null, null);
		names.put(null, null);
		System.out.println(names);		
	}
}
