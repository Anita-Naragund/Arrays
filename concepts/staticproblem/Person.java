package com.xworkz.concepts.staticproblem;

public class Person {
	public static String name;
	public static String dob;
	public static String address;
	
	public static void displayInfo()
	{
		System.out.println("Invoked displayInfo");
		System.out.println(name);
		System.out.println(dob);
		System.out.println(address);
	}

}
