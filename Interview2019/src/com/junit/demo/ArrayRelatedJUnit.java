package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArrayRelatedJUnit extends AbstractArrayRelated {
	int a[] = { 1, -9, 7, 90, 70, 54, 79,-54,-32 };
	
	//test case 1
	@Test
	public void maxNum() {	
		assertEquals(90,findMax(a));
	}
	
	//test case 2
	@Test
	public void findSum() {
		assertEquals(90,findSum(a));		
	}
	
	
}
