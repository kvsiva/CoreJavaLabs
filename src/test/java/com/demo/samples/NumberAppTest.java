package com.demo.samples;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.Test;

public class NumberAppTest {
	
	NumberApp numObj;

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testIsEven() {
		
		numObj=new NumberApp();
		
		assertTrue(numObj.isEven(10));
		assertFalse(numObj.isEven(5));
		
	}

}
