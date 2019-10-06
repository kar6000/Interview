package com.string;

import java.util.Arrays;

public class AnagramDemo {

	public static void main(String[] args) {
		String s1 ="ipsita";
		String s2 ="atispi";
		if (IsAnagram(s1, s2)) {
			System.out.println("This is an Anagram");
		} else {
			System.out.println("This is not an anagram");
		}		
	}
	
	public static boolean IsAnagram(String s1,String s2) {
		if(s1.length()!=s1.length()) {
			return false;
		}
		
		char m1[] = s1.toCharArray();
		System.out.println(s1);
		char m2[] =s2.toCharArray();
		System.out.println(s2);
		
		Arrays.sort(m1);
		System.out.println(m1);
		Arrays.sort(m2);
		System.out.println(m2);
		
		String s3 = new String(m1);  // aailv
		String s4 = new String(m2);  // aailv
		return s3.equals(s4);	
		
	}

}
