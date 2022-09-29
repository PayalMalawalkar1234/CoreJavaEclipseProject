package com.bankdemo;

public class Bank {

	private boolean netBanking;
	private int noOfBranches;
	protected double rateOfInterest;
	String name;

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bank(boolean netBanking, int noOfBranches, double rateOfInterest, String name) {
		super();
		this.netBanking = netBanking;
		this.noOfBranches = noOfBranches;
		this.rateOfInterest = rateOfInterest;
		this.name = name;
	}

	public boolean isNetBanking() {
		return netBanking;
	}

	public void setNetBanking(boolean netBanking) {
		this.netBanking = netBanking;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}

	public double getRateOfInterest() {
		return rateOfInterest;
	}

	public void setRateOfInterest(double rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Bank [netBanking=" + netBanking + ", noOfBranches=" + noOfBranches + ", rateOfInterest="
				+ rateOfInterest + ", name=" + name + "]";
	}

	public void setRateOfInterest() {
		// TODO Auto-generated method stub

	}

}
