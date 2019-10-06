package com.junit.demo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SortStringJUnit extends AbstractSortString {

	//test case 1
	@Test
	public void test1() {		
		assertEquals("iips", sort("ipsi"));
	}
	//test case 2
	@Test
	public void test2() {		
		assertEquals("aelpp", sort("apple"));
	}
}
