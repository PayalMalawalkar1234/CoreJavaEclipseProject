package com.demo;

public class EnumMain {

	enum Colours {
		RED(2), WHITE(7), BLACK(6), YELLOW(6), GREEN(5), BLUE(4);

		private int value;

		private Colours(int value) {
			this.value = value; // constructor of enum
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// enum Colours {
		// RED, WHITE, BLACK, YELLOW, GREEN, BLUE
		// } // enum: array of constants

		for (Colours c : Colours.values()) {
			System.out.println(c + " " + c.value);
		}
	}

}
