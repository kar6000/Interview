package com.junit.demo;

import java.util.Arrays;

abstract class AbstractSortString {

	public static String sort(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		return new String(c);
	}
	
}
