package com.JunitDemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {

	@BeforeClass
	public static void callFirst()
	{
		System.out.println("Before all the Classes executed exactly once");
	}
	
	@Before
	public void callBeforeTestCase()
	{
		System.out.println("Before Test case");
	}
	// for each method
	@Test
	public void test1() {
		System.out.println("Inside Test");
	}
	@Test
	public void test2() {
		System.out.println("Inside Test");
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
		System.out.println("After all classes executed exactly once");
	}

}
