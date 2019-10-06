package com.string;

public class StringReplace {

	public static void main(String[] args) {
		//replace a string "google to "ipsita"
		String s ="google";
		String s1 = s.replace("google", "ipsita");
		System.out.println(s1);
		
		// replace i with 7 in "ipsita"
		String s2 =s1.replaceAll("i", "7");
		System.out.println(s2);
	}

}
