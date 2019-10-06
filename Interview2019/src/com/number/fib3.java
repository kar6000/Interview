package com.number;

public class fib3 {

	public static void main(String[] args) {
		
		int b=fib(6);	
		System.out.println(b);

	}
	
	
	public static int fib(int n) {
		if(n<=0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		int fib = fib(n-1)+fib(n-2);
		return fib;		
	}

}
