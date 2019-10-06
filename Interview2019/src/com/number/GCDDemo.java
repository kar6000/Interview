package com.number;

public class GCDDemo {

	public static void main(String[] args) {

		int x = gcd(50,20);
		System.out.println("gcd is " + x);
		
		int y = gcd2(64896565, 24545);
		System.out.println("gcd is " + y);

	}

	public static int gcd(int a, int b) {

		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		if (a > b) {
			return gcd(a - b, b);
		} else if (a < b) {
			return gcd(b - a, a);
		} else {
			return a;
		}

	}

	public static int gcd2(int a, int b) {

		if (a == 0) {
			return b;
		}
		if (b == 0) {
			return a;
		}

		if (a > b) {
			return gcd2(a%b, b);
		} else if (a < b) {
			return gcd2(b%a, a);
		} else {
			return a;
		}

	}

}
