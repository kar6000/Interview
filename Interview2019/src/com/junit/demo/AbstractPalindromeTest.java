package com.junit.demo;

abstract class AbstractPalindromeTest {
	
	public static boolean isPali(String s) {

		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			rev = rev + (s.charAt(i));
		}
		if (s.equalsIgnoreCase(rev)) {
			return true;
		}
		return false;
	}

}
