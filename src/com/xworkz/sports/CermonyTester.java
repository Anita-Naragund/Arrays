package com.xworkz.sports;

import com.xworkz.sports.awards.Cermony;

public class CermonyTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] fooditems= {"Jamoon","Kaju Barfi","pepper chicken","Fride Rice","Mysore pak"};
		Cermony cermony=new Cermony();
		cermony.setFoods(fooditems);
		cermony.distributedAwards("Anita", "Oscar");
		cermony.displayFoods();
		cermony.displayCermonyNameAndFoods();
		cermony.accessParentMethods();
	}
}
