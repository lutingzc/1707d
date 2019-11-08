package com.bw.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.lutingting.StringUtils;

public class TestStringUtils {
	@Test
	public void testIsBlank() {
	
		assertTrue(StringUtils.isBlank("  "));
	}
	@Test
	public void testIsBlank2() {
		assertFalse(StringUtils.isBlank("aaaa"));
		
	}
	@Test
	public void testBandomn() {
		String s = StringUtils.getRandomStr(10);
		System.out.println("s is :: "+s);
	}
	@Test
	public void testStrRland() {
		String s = StringUtils.getRandomStr(25);
		System.out.println("s is :: "+s+"and 长度是"+s.length());
	}
	@Test
	public void testCnStrn() {
		String s = StringUtils.getRandomStr(25);
		System.out.println("s is :: "+s+"changdu"+s.length());
	}
}
