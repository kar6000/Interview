package com.string;

public class RemoveVowels {

	public static void main(String[] args) {
		String s ="california";		
		removeVowels(s);
	}
	
	public static void removeVowels(String s) {
		StringBuffer sb = new StringBuffer();
		
		for(int i=0; i<s.length(); i++) {
			char c =s.charAt(i);
			if(!(c == 'a'| c =='A' | c =='E' |  c =='e')) {
				sb.append(c);
			}			
		}
		String s2 = new String(sb);
		System.out.println(s2);
		
	}

}
