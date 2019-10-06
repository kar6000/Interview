package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringRevJUnit extends AbstractStringRev {

	//test case 1
	@Test
	public void test1() {
		assertEquals("atispi", StringRev("ipsita"));
	}
	//test case 2
	@Test
	public void test2() {
		assertEquals("elppa", StringRev("apple"));
	}
	//test case 3
	@Test
	public void test3() {
		assertEquals("amis", StringRev("sima"));
	}
}
