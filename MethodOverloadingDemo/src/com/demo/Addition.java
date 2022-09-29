package com.demo;

public class Addition {

	static int add(int a, int b) {
		System.out.println("Addition of 2 int numbers");
		int sum = (int) (a + b);
		return sum;

	}

	static int add(int a, int b, int c) {
		System.out.println("---- 3 number addition-------");
		int sum = a + b + c;
		return sum;
	}

	// method overloading type of argumnets

	float add(float a, float b) {
		System.out.println("---- 2 number float addition-------");
		float sum = a + b;
		return sum;
	}

	public static void main(String[] args) {
		add(6, 7);
		add(0, 8, 1);
	}

}