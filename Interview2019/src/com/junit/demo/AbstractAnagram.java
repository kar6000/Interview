package com.junit.demo;

import java.util.Arrays;

abstract class AbstractAnagram {
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
			
			String s3 = new String(m1);  
			String s4 = new String(m2);  
			return s3.equals(s4);				
		}
}
