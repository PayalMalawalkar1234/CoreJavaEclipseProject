package com.exception;

import java.util.Scanner;

public class Throwdemo {

	public class Person {

		public static void main(String[] args) throws CustomException {
			Scanner sc = new Scanner(System.in);

			System.out.println("Enter Name");
			String n = sc.next();

			System.out.println("Enter accBalanace");
			int b = sc.nextInt();
			if (b < 100) {
				throw new CustomException();

			}
			sc.close();
		}

	}

}
