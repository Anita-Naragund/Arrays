package com.xworkz.concepts.phone;

public class Mobile {
	public String model;
	public String companyName;
	public String color;
	public static String OS;
	
	public void displayInfo()
	{
		System.out.println("Invoked displayInfo");
		System.out.println(model);
		System.out.println(companyName);
		System.out.println(color);
		System.out.println(OS);
	}

}
