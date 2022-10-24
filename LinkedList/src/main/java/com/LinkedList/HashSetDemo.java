package com.LinkedList;

import java.util.HashSet;
import java.util.LinkedList;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("Apple");
		linkedlist.add("Banana");
		linkedlist.add("Carrot");
		linkedlist.add("Grapes");
		linkedlist.add("Kiwi");
		linkedlist.add("Lemon");
		linkedlist.add("Orange");
		System.out.println(linkedlist);

		HashSet<String> set = new HashSet<String>(linkedlist);
		System.out.println(set);

		set.add(null);

		System.out.println(set);

	}

}
