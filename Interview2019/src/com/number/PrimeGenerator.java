package com.number;

public class PrimeGenerator {

	public static void main(String[] args) {
		//Generate prime number from 0 to 1000
		for(int i=0; i<1000; i++ ) {
			if(isPrime(i)) {
				System.out.println(i);				
			}
		}
	}
	
	public static boolean isPrime(int n) {
		
		if( n<=0) {
			return false;
		}
		for(int i=2; i<n-1; i++) {
			if(n%i ==0) {
				return false;
			}
		}
		return true;
		
	}

}
