package com.JunitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class CalculatorTest {
	
	static int a,b;

	@BeforeClass
	public static void callFirst()
	{
		a=b=40;
		System.out.println("a and b are set to 40...........");
	}
	
	@Before
	public void callBeforeTestCase()
	{
		System.out.println("Before Test ");
	}
	// for each method
	@Test
	// POSITIVE TEST CASE
	public void testAdd() {
		assertEquals("Checking sum...",80,new Calculator().add(a, b));
		
	}
	
	// NEGATIVE TEST CASE
	@Test
	public void testSub2() {
		assertEquals("Checking subtraction...",1,new Calculator().sub(a, b));
	}
	@Test
	public void testSub() {
		assertEquals("Checking subtraction...",0,new Calculator().sub(a, b));
	}
	@Test
	public void test3() {
		System.out.println("Inside Test");
	}
	
	@After
	public void callAfterTestCase()
	
	{
		System.out.println("After Test case");
	}
	
	@AfterClass
	public static void callLast() 
	{
		a=b=0;
		System.out.println("a and b are reset");
	}

	@Ignore   // deactivate
	public void neverRun()
	{
		System.out.println("Don't run this");
		
	}
	
	@Test(timeout=500)
	
		public void testTimeOut()
		{
			System.out.println("To enforce to timeout");
			while(true) {
				
			}
		}
	}

