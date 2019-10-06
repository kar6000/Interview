package com.junit.demo;

abstract class AbstractStringRev {

	public static String StringRev(String s) {
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		return rev;
	}
	
}
