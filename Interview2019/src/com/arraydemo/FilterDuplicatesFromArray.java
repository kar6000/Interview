package com.arraydemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FilterDuplicatesFromArray {

	// Filter Duplicate Elements From An Array And Print As A List
	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<String>();
		list.add("java");
		list.add("java");
		list.add("python");
		list.add("perl");
		System.out.println(list);

		Set<String> result = new HashSet<String>();
		for (String item : list) {
			if (list.contains(item)) {
				result.add(item);
			}
		}
		System.out.println(result);
	}
}
