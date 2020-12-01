package com.xworkz.constructor;

import com.xworkz.constructor.season.Aquarium;

public class AquariumTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("invoked main method");
		
		Aquarium aquarium=new Aquarium();
		String nameIs=aquarium.fishName;
		System.out.println(nameIs);
		
		Aquarium aquarium1=new Aquarium("Star Fish");
		String fishNameIs=aquarium1.fishName;
		System.out.println(fishNameIs);
		
		Aquarium aquarium2=new Aquarium("Star Fish",4000,"Chlorine","5 gallon");
		String name=aquarium2.fishName;
		double priceIs=aquarium2.price;
		String chemicalUsedIs=aquarium2.chemicalUsed;
		String sizeOfTank=aquarium2.tankSize;
		System.out.println(name);
		System.out.println(priceIs);
		System.out.println(chemicalUsedIs);
		System.out.println(sizeOfTank);
		
		Aquarium aquarium3=new Aquarium(5000.2);
		double priceOfTank=aquarium3.price;
		System.out.println(priceOfTank);
		
		Aquarium aquarium4=new Aquarium("Shark","5 gallon");
		String nameOfFish =aquarium4.fishName;
		System.out.println(nameOfFish);

	}

}
