package com.example;

public class StudentTest {

	static void displayStudents(Student[] s1) {
		for (Student obj : s1) {
			System.out.println("Name:" + obj.getName() + "Course:" + obj.getCourse() + "Marks:" + obj.getMarks());

		}
	} // method overloading

	static void displayStudents(Student[] s1, double marks) {
		for (Student obj : s1)

		{
			if (obj.getMarks() >= marks)

				System.out.println("Name:" + obj.getName() + "Course:" + obj.getCourse() + "Marks:" + obj.getMarks());

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[] = new Student[5];
		s[0] = new Student(101, "Ram", 22, "BCA", 77.8);
		s[1] = new Student(101, "Shyam", 24, "MCA", 78.7);
		s[2] = new Student(101, "Sam", 21, "BCA", 78.9);
		s[3] = new Student(101, "Pam", 23, "MCA", 78.9);
		s[4] = new Student(101, "Tom", 22, "BCA", 74.8);
		int ch;

		displayStudents(s, 78.0);

	}

}
