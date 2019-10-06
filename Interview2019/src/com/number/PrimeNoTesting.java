package com.number;

public class PrimeNoTesting {

	public static void main(String[] args) {
		
		System.out.println(isPrime(2));
		System.out.println(isPrime(9));
		System.out.println(isPrime(100));
		System.out.println(isPrime(29));
		System.out.println(isPrime(89));
		System.out.println(isPrime(11));
	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < n - 1; i++) {
			if (n % 2 == 0) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

}
