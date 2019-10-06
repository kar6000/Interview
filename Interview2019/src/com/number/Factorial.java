package com.number;

public class Factorial {

	public static void main(String[] args) {
		// Factorial using recursion
		
		System.out.println("factorial of 5 is "+fact(5));
		System.out.println("factorial of 6 is "+fact(6));
		System.out.println("factorial of 4 is "+fact(4));
		System.out.println("factorial of 9 is "+fact(9));

	}
	
	public static int fact(int n) {
		if(n==0) {
			return 1;
		}else {
		return n * fact(n-1);
		}
	}

}
