package com.xworkz.laptop.company;

public class Admin {
	public static void develop()
	{
		System.out.println("Invoked develop");
		String model=Lenovo.getModelNumber();
		System.out.println("will develop using model "+model);
		Lenovo.developApplication();
		System.out.println("EXIT::main()");
	}

}
