package com.junit.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PalindromeTestJUnit extends AbstractPalindromeTest {
	
	//test case 1
	@Test
	public void test1() {
		String s = "madam";
		boolean b = isPali(s);
		assertTrue("madam is a boolean", true);
	}
	//test case 2
	@Test
	public void test2() {
		String s = "teacher";
		boolean b = isPali(s);
		assertTrue("teacher is a boolean", false);
	}
	//test case 3
	@Test
	public void test3() {
		String s = "ipsita";
		boolean b = isPali(s);
		assertTrue("ipsita is a boolean", false);

	}
	//test case 4
	@Test
	public void test4() {
		String s = "ana";
		boolean b = isPali(s);
		assertTrue("ana is a boolean", true);
	}	
}
