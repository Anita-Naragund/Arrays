package com.xworkz.constructor;

public class FruitTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		
		Fruit fruit=new Fruit("Apple");
		String fruitName=fruit.name;
		System.out.println("Name is ="+fruitName);
		
		Fruit fruit1=new Fruit("Mango",78984);
		String fruitNameIs=fruit1.name;
		double priceIs=fruit1.price;
		System.out.println(fruitNameIs);
		System.out.println(priceIs);
		
		Fruit fruit2=new Fruit();
		String nameIs=fruit2.name;
		System.out.println(nameIs);

	}

}
