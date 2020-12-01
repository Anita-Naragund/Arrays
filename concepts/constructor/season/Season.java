package com.xworkz.constructor.season;

public class Season {
	public String name;
	public String startMonth;
	public Season()
	{
		System.out.println("Invoke season");
		
	}
	
	public Season(String name1,String startMonth1) {
		System.out.println("Invoke constructor Season");
		name=name1;
		startMonth=startMonth1;
	}
	
	public Season(String name)
	{
		this.name=name;
		System.out.println("EXIT::main");
	}

}
