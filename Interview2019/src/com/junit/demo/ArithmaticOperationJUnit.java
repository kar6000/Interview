package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ArithmaticOperationJUnit extends AbstractArithmaticOperation {
	
	////test case 1
	@Test
	public void add() {	
		int result =intAdd(10,60);
		assertEquals(70,result);
	}
	//test case 2	
	@Test
	public void sub() {	
		int result =intSub(10,20);
		assertEquals(-10,result);
	}
	//test case 3
	@Test
	public void prod() {	
		int result =intMul(10,30);
		assertEquals(300,result);
	}
	
}
