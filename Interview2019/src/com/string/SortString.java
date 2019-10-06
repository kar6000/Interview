package com.string;

import java.util.Arrays;

public class SortString {

	public static void main(String[] args) {
		
		String s ="banana";
		System.out.println(sort(s));
		
		String s1 ="java";
		System.out.println(sort(s1));				
		
	}
	
	public static String sort(String s) {
		char c[] = s.toCharArray();
		Arrays.sort(c);
		return new String(c);		
	}	
	

}
