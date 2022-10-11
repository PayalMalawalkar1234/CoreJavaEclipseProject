package com.string;

public class StringDemo {

	public static void main(String[] args) {
		// String Copying
		String Originals = "Welcome";
		String Copieds = "Java";
		Copieds = Originals;
		System.out.println("Original String is: " + Originals);
		System.out.println("Copied String is: " + Copieds);
		// String Operations
		String s1 = "Welcome";
		String s2 = "Java";

		// 1.Printing character at any position
		System.out.println("Character at 5th position is: " + s1.charAt(4));
		System.out.println("Character at 1st position is: " + s2.charAt(0));

		// 2.Printing length of the String
		System.out.println("Length of String s1 is: " + s1.length());
		System.out.println("Length of String s2 is: " + s2.length());

		// Combining two strings
		s1 = s1.concat(s2);
		System.out.println("Concatenated String is: " + s1);

		// Substring
		System.out.println("Subpart of String s1 is: " + s1.substring(3));
		System.out.println("Subpart of String s1 is: " + s1.substring(2, 4));

		// To find character sequence
		// * prints false as java is case sensetive
		System.out.println(s2.contains("java"));
		System.out.println(s2.contains("java"));
		System.out.println(s1.contains("welcome"));
		System.out.println(s1.contains("java"));

		System.out.println(s2.contains("Java"));
		System.out.println(s2.contains("Java"));
		System.out.println(s1.contains("Welcome"));
		System.out.println(s1.contains("Java"));

		// null string

		String s = "";
		System.out.println(s.isEmpty());

		// Replace string
		String s3 = s2.replace("Python", "c#");
		System.out.println(s3);

		// to find postion of character
		int position = s1.indexOf("c");
		System.out.println(position);

		// to lowercae and uppercase
		s1 = s1.toLowerCase();
		System.out.println(s1);
		s1 = s1.toUpperCase();
		System.out.println(s1);

		// To remove extra space in String
		String s4 = "     Hello Google";
		// s4 = s4.trim();
		System.out.println(s4.trim());
		System.out.println(s4.length());

	}

}
