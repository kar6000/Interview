package com.string;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringRevJUnit extends StringRevAbstract {	
	
	@Test
	public void test1() {
		StringRev("ipsita");
		assertEquals("atispi", StringRev("ipsita"));
	}
	
	@Test
	public void test2() {
		StringRev("apple");
		assertEquals("elppa", StringRev("apple"));
	}	
	
	@Test
	public void test3() {
		StringRev("sima");
		assertEquals("amis", StringRev("sima"));
	}	
}
