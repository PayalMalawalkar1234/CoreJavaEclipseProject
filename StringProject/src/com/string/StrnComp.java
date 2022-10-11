package com.string;

public class StrnComp {

	public static void main(String[] args) {
		String s1 = " Eleven";
		String s2 = "eleven";
		String s3 = new String("Eleven");

		System.out.println("Compairing String Literals: " + s1.equals(s2));
		System.out.println("Compairing String Literals (Ignorng case): " + s1.equalsIgnoreCase(s2));
		System.out.println("comparing literal and object" + s1.equals(s3));// == operator: compares the refernce
		System.out.println("comparing 2 literals(==)" + (s1 == s2));
		System.out.println("comparing  literals and object(==)" + (s1 == s3));// gives false it compares the reference

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		String s4 = new String("Java");
		String s5 = new String("Java");
		System.out.println(s3 == s4);
		System.out.println(s3.equals(s4));// compare content

		// comparison
		// compareTo
		// s1==s2 returns 0
		// s1>s2 return postive first letter
		// s1<s2 return negative

		String m1 = "Four";
		String m2 = "Four";
		String m3 = "Number";

		System.out.println("comparing compareTo:" + m1.compareTo(m2));
		System.out.println("comparing compareTo:" + m1.compareTo(m3));// m1<m3 compares j and l and the diffrenece is 2
		System.out.println("comparing compareTo:" + m3.compareTo(m1));// m3>m1

		String s6 = "Payal";
		s6.concat(" Malawalkar");
		System.out.println("Literal string is :" + s6);

		String s7 = new String("Pratik");
		s1.concat(" Malwalkar");
		System.out.println("Object string is :" + s4);

		// String class: immutable

	}

}
