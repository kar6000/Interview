package com.arraydemo;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		
		String s [] = {"java", "c", "c++", "fruits", "python"};		
		revArray(s);	
	}
	
	public static void revArray(String a[]) {
		
		int len = a.length;
		String temp;
		for(int i=0; i<len/2; i++) {
			temp = a[i];
			a[i]=a[len-1-i];
			a[len-1-i] =temp;			
		}
		System.out.println("reverse of the given array is "+Arrays.toString(a));		
	}
}
