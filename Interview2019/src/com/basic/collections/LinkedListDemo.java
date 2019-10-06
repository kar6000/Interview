package com.basic.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList <String> names = new LinkedList<String>();
		names.addFirst("banana");
		System.out.println(names);
		names.add("nuts");
		names.add("nuts");
		names.add("nuts");
		names.add("pineapple");
		names.addLast("watermelon");
		System.out.println(names);
		names.addFirst("mango");
		System.out.println(names);
		names.add(null);
		names.addFirst("mango");
		System.out.println(names);

	}
}
