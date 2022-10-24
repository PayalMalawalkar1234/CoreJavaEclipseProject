package com.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkList = new LinkedList<String>();

		linkList.add("Rose");
		linkList.add("Lily");
		linkList.add("Lotus");
		linkList.add("Sunflower");
		linkList.add("Jasmine");
		linkList.add("Marigold");
		linkList.add("Tulip");

		System.out.println(linkList);

		linkList.add(2, "Apple");
		System.out.println(linkList);

		List<String> linkList2 = new LinkedList<String>();
		linkList2.add("Pine Apple");
		linkList2.add("Rasberry");

		linkList.addAll(linkList2);
		System.out.println(linkList);

		linkList.addFirst("Blackberry");
		System.out.println(linkList);

		linkList.removeAll(linkList2);
		System.out.println(linkList);

		linkList.add("Orange");
		System.out.println(linkList);

		linkList.removeFirstOccurrence("Orange");
		System.out.println(linkList);

		// to print the list in reverse order
		Iterator<String> itr = linkList.descendingIterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
