package com.bankdemo;

public class SBI extends Bank {

	@Override
	public void setRateOfInterest() {
		this.rateOfInterest = 8.5;
		this.name = "SBI";
	}

}
