package com.string;

public class PalindromeTest {

	public static void main(String[] args) {
		String s = "madam";
		boolean b = isPali(s);
		if (b) {
			System.out.println("This is a palindrome");
		} else {
			System.out.println("this is not a palindrome");
		}
	}

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
