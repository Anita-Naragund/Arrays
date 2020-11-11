package com.xworkz.basics.creditcard;

public class CreditCard {
	private static double totalAmount=1000;
	public static void expenditure(double amount)
	{
		System.out.println("Invoked expenditure method");
		System.out.println("args :"+amount);
		if(amount<=1000)
		{
			System.out.println("You can shop");
			totalAmount=totalAmount-amount;
			System.out.println("Remaining balance in credit card is :"+totalAmount);
		}
		else
		{
			System.out.println("Sorry,You can not shop more than 1000");
		}
		System.out.println("Exit");
	}

}
