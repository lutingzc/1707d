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
}
