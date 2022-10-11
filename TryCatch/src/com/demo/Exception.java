package com.demo;

public class Exception {

	static void validateAge(int age) throws java.lang.Exception {
		if (age < 18) {
			throw newArithmaticException("Person cannot vote");

		} else
			System.out.println("Person can vote");

	}

	private static java.lang.Exception newArithmaticException(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public static void main(String[] args) {
		int age = 16;
		try {
			validateAge(age);
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
