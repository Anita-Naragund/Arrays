package com.xworkz.concepts;

import com.xworkz.concepts.staticproblem.Person;

public class StaticTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		Person.displayInfo();
		Person.name="Anu";
		Person.dob="04/08/1998";
		Person.address="Gadag";
		Person.displayInfo();
		
		Person.name="Avi";
		Person.dob="22/010/1994";
		Person.address="Hubli";
		Person.displayInfo();

	}

}
