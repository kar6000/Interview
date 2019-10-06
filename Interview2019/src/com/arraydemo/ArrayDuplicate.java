package com.arraydemo;

public class ArrayDuplicate {

	public static void main(String[] args) {
		//Find duplicates in any array
		
		int a[] = {1,2,2,3,4,5,5,9,9,9};
		findDuplicates(a);
		
		String s[] = {"java","java","C", "python", "python", "PYTHON"};
		findDuplicates(s);	
	}
	
	public static void findDuplicates(int a[]) {
		for(int i=0; i<a.length; i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i] ==a[j]) {
					System.out.println("duplicate is "+a[i]);
				}
			}
		}
	}
	
	public static void findDuplicates(String s[]) {
		for(int i=0; i<s.length; i++) {
			for(int j=i+1; j<s.length;j++) {
				if(s[i] ==s[j]) {
					System.out.println("duplicate is "+s[i]);
				}
			}
		}
	}
}


