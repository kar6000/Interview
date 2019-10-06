package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// Change a string such that 1st character is upper case and 2nd is lower case
		// and so on

		String str = "java";

		for (int i = 0; i < str.length(); i++) {
			int aChar = str.charAt(i);
			if (aChar >= 96 && aChar <= 123 && aChar == 97) {
				aChar = aChar - 32;
			}

			System.out.print((char) aChar);
		}
	}

}
