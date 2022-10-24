package com.LinkedList;

import java.util.TreeSet;

public class TreeSetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<Integer> set = new TreeSet<Integer>();
		set.add(23);
		set.add(12);
		set.add(22);
		set.add(42); // ignores the duplicate values
		// set.add(null); : Exception

		System.out.println(set);

		// highest and lowest value: retrieve and remove
		System.out.println("Lowest value :" + set.pollFirst());
		System.out.println("Highest value:" + set.pollLast());

		System.out.println(set);

		TreeSet<String> set1 = new TreeSet<String>();
		set1.add("Dairy Milk");
		set1.add("5 Star");
		set1.add("KitKat");
		set1.add("Bournville");

		System.out.println("Original set :" + set1);

		System.out.println("Reverse set :" + set1.descendingSet());
		// elements smaller than this string

		System.out.println("Head set :" + set1.headSet("Dairy Milk", true));

		System.out.println("Head set :" + set1.tailSet("Dairy Milk", true));

	}

}
