package com.xworkz.constructor;

import com.xworkz.constructor.temple.Temple;

public class TempleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main method");
		Temple temple;
		temple=new Temple("Aanjaneya",5.00f,"Gadag","Sugar",10.00f);
		String name=temple.getName();
		float startTime=temple.getStartTime();
		String location=temple.getLocation();
		String prasada=temple.getPrasada();
		float endTime=temple.getCloseTime();
		
		System.out.println(name);
		System.out.println(startTime);
		System.out.println(location);
		System.out.println(prasada);
		System.out.println(endTime);
		
		prasada="banana";
		temple.setPrasada(prasada);
		System.out.println("Updated prasada is ="+prasada);
	}

}
