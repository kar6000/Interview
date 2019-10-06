package com.arraydemo;

public class TwoMaxNumber {

	//find max 2 numbers in an array(Write another program to find 2 minimum numbers in an Array
	public static void main(String[] args) {
		int n[] = {1,2,3,4,70,6,7,60};
		max1(n);		
	}
	
	public static void max1(int n[]) {
		
		int max1 = n[0];
		
		for(int i =0; i<n.length; i++) {
			if(n[i]>max1) {
				max1 = n[i];				
			}
		}
		System.out.println("max1 is "+max1);
		
		int max2 = Integer.MIN_VALUE;
		System.out.println(max2);
		
		for(int i=0; i<n.length; i++) {
			if(n[i]>max2 && n[i]<max1) {
				max2 = n[i];
			}
		}
		System.out.println("max2 is "+max2);			
	}
}
