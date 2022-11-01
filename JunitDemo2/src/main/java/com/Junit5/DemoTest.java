package com.Junit5;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

public class DemoTest {

	@BeforeAll
	public static void callFirst()
	{
		System.out.println("Before all the Classes executed exactly once");
	}
	
	@BeforeEach
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
	@Test  // runs one extra time
	@RepeatedTest(value=3)
	public void repeatedMe() {
		System.out.println("Repeated test case");
	}
	@AfterEach
	public void callAfterTestCase()
	
	{
		System.out.println("After Test case");
	}
	
	@AfterAll
	public static void callLast() 
	{
		System.out.println("After all classes executed exactly once");
	}

	@Disabled  // deactivate
	public void  neverRun() {
	System.out.println("Don't run this");
	}
	
}
