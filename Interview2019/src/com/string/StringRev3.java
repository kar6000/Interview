package com.string;

public class StringRev3 {

	public static void main(String[] args) {	
		
		String s1= StringRev("ipsita");	
		System.out.println("Reverse is "+s1);
		
		String s2= StringRev("i--iosiu");	
		System.out.println("Reverse is "+s2);
		
		String s3= StringRev(" anytrr");	
		System.out.println("Reverse is "+s3);
		
		String s4= StringRev("oracle");	
		System.out.println("Reverse is "+s4);
		
		String s5= StringRev("intuit");	
		System.out.println("Reverse is "+s5);		
	}	
	
	public static String StringRev(String s) {
		int len = s.length();
		String rev = "";

		for (int i = len - 1; i >= 0; i--) {
			// s.charAt(i);
			rev = rev + s.charAt(i);
		}
		return rev;		
	}
}
