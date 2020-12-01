package com.xworkz.constructor;

public class Fruit {
	public String name;
	public double price;
	
	public Fruit(String name)
	{
		this.name=name;
		System.out.println("Constructor Fruit");
	}
	public Fruit(String name1,double price1) {
		name=name1;
		price=price1;
		System.out.println("Display price and name");
	}
	
	public Fruit()
	{
		System.out.println("EXIT");
	}

}
