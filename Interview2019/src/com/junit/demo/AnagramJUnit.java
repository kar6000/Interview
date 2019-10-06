package com.junit.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AnagramJUnit extends AbstractAnagram {

	//test case 1
	@Test
	public void test1() {
		boolean b = IsAnagram("ipsita", "atispi");
		assertTrue(b);
	}
	//test case 2
	@Test
	public void test2() {
		boolean b = IsAnagram("mama", "amam");
		assertTrue(b);
	}
	//test case 3
	@Test
	public void test3() {
		boolean b = IsAnagram("orange", "orange");
		assertTrue(b);
	}
}
