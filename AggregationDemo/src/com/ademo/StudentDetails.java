package com.ademo;

public class StudentDetails {

	static void display(Student s) {
		System.out.println("Student id:" + s.getId());
		System.out.println("Student Name:" + s.getName());
		System.out.println("Student Address:" + s.getAddr());

		System.out.println(s);

	}

	public static void main(String[] args) {

		Student s1 = new Student(101, "Payal", new Address("TH22", "Amravati", 444607, "MH"));
		System.out.println("Student's address details are:");
		display(s1);

		// TODO Auto-generated method stub

	}

}
