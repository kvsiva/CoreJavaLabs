package com.demo.samples;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class SimpleMathTest {

	SimpleMath testObj;
	
	@BeforeClass
	public static void testBeforeClass(){
		System.out.println("Testing BeforeClass");
	}

	@Before
	public void setup() {
		testObj = new SimpleMath();
	}

	@Test
	public void testSum() {
		assertEquals("Testing Sum:", 9, testObj.sum(3, 6));
	}

	@Test
	public void testSquare() {
		assertEquals("Testing Square:", 16,testObj.square(4));
	}
	
	@After
	public void teardown(){
		testObj=null;
	}
	
	@AfterClass
	public static void testAfterClass(){
		System.out.println("Testing AfterClass");
	}


}
