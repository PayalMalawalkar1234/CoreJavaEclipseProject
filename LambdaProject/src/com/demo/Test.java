package com.demo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 5;
		int b = 9;

		My m = (p, q) -> {
			System.out.println(p + q);
		};

		m.add(a, b);
	}

}
