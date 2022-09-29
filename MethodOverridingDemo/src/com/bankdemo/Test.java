package com.bankdemo;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CanaraBank ac1 = new CanaraBank();
		ac1.setRateOfInterest();
		System.out.println(ac1.getRateOfInterest());

		SBI ac2 = new SBI();
		ac2.setRateOfInterest();
		System.out.println(ac2.getRateOfInterest());

	}

}
