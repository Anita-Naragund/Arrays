package com.xworkz.basics.pocket;

public class PocketMoneyEstimator {
	private static double totalAmount;
	public static void request(double amount,String day)
	{
		System.out.println("invoked request method");
		System.out.println("args o :"+amount);
		System.out.println("args 1 :"+day);
		totalAmount=totalAmount+amount;
		System.out.println("total amount after Request :"+totalAmount);
		System.out.println("EXIT::request()");
	}
	
	
	public static void expenditure(double amount)
	{
		System.out.println("invoked expenditure method");
		System.out.println("args :" +amount);
		totalAmount=totalAmount-amount;
		System.out.println("total amount after Expenditure :"+totalAmount);
		System.out.println("EXIT::expenditure()");
	}
	

}
