package com.xworkz.basics.pocket;

public class PocketTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main method");
		PocketMoneyEstimator.request(50,"Monday");
		PocketMoneyEstimator.request(100,"Tuesday");
		
		PocketMoneyEstimator.expenditure(50);
		PocketMoneyEstimator.expenditure(15);
		

	}

}
