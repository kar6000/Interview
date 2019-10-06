package com.junit.demo;

abstract class AbstractArrayRelated {

	// Find maximum number in array
	public static int findMax(int n[]) {
		int max = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] > max) {
				max = n[i];
			}
		}
		System.out.println("max number is " + max);
		return max;
	}

	// Find minimum number in array
	public static int findMin(int n[]) {
		int min = n[0];
		for (int i = 0; i < n.length; i++) {
			if (n[i] < min) {
				min = n[i];
			}
		}
		System.out.println("min is " + min);
		return min;
	}
	// Find sum of the array

	public static int findSum(int n[]) {
		int sum = 0;
		for (int i = 0; i < n.length; i++) {
			sum = sum + n[i];
		}
		System.out.println("Sum is :" + sum);
		return sum;
	}

	// Find product of array
	public static int findProduct(int n[]) {
		int prod = 1;
		for (int i = 1; i < n.length; i++) {
			prod = prod * n[i];
		}
		System.out.println("product is :" + prod);
		return prod;
	}

	// Find the duplicate number in the array
	public static void findDuplicate(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.println("duplicate is " + a[i]);
				}
			}
		}
	}

	// find the negative numbers in array
	public static void findNeg(int a[]) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] < 0) {
				System.out.println("negative numbers are " + a[i]);
			}
		}
	}

}
