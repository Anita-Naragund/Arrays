package com.xworkz.constructor.season;

public class Aquarium {
	public String fishName;
	public double price;  
	public String chemicalUsed;
	public String tankSize;
	
	public Aquarium()
	{
		System.out.println("Constructor Aquarium");
	}
	
	public Aquarium(String fishName)
	{
		System.out.println("Invoke constructor");
		this.fishName=fishName;
	}
	
	public Aquarium(double price)
	{
		System.out.println("price of aquarium is");
		this.price=price;
	}
	
	public Aquarium(String fishName,String tankSize)
	{
		System.out.println("Name and price is");
		this.fishName=fishName;
		this.tankSize=tankSize;
	}
	
	public Aquarium(String fishName,double price,String chemicalUsed,String tankSize )
	{
		this.fishName=fishName;
		this.price=price;
		this.chemicalUsed = chemicalUsed;
		this.tankSize=tankSize;
		System.out.println("Exit main");
	}

}
