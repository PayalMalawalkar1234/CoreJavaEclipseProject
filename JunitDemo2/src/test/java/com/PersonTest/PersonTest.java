package com.PersonTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.Person.Person;

class PersonTest {

	static Person p;
	
	@BeforeAll
	public static void createPerson()
	{
		p=new Person();
		p.setPid(101);
		p.setName("Payal");
		
	}
	@BeforeEach
	public void runBeforeTest() {
		
	}
	
	@Test   // POSITIVE TEST CASE
	public void testNameLength()
	{
		assertThat(12 > 9).isTrue();
	}
	
	@AfterEach
public static void runAfterTest() {
		
	}
	
	@AfterAll
public static void runAfterAllTest() {
		
	}
	
	
	
	
	
}
