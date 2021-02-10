package com.xworkz.moon.service;

public interface RestaurantService {
	
	public void displayItemsGreaterThan(double price);
	
	public void displayByName(String name);
	
	public void findAndDisplay(Finder find);

}
