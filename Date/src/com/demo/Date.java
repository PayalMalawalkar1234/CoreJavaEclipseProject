package com.demo;

import java.text.DateFormat;
import java.time.ZonedDateTime;
import java.util.Locale;

public class Date {

	public static void main(String[] args) {
		java.util.Date d2 = new java.util.Date();
		System.out.println(new java.util.Date());
		System.out.println(ZonedDateTime.now());
		Locale l = new Locale("IN");
		Locale.setDefault(l);
		System.out.println(Locale.getDefault());
		DateFormat dfIN = DateFormat.getDateInstance(DateFormat.FULL, l);
		System.out.println("India " + dfIN.format(d2));

	}

}
