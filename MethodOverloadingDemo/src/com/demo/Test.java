package com.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition a = new Addition();
		int result;
		result = Addition.add(4, 5);

		System.out.println(result);

		result = Addition.add(5, 4, 3);

		System.out.println(result);

		float sum = a.add(9.5f, 4.5f);

		System.out.println(sum);

	}

}
