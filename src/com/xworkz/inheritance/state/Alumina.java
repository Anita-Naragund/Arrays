package com.xworkz.inheritance.state;

import com.xworkz.inheritance.scheme.RawMaterial;

public class Alumina extends RawMaterial {
	public Alumina()
	{
		super();
		System.out.println("Created Alumina");
	}
	
	@Override
	public void delivery() {
		// TODO Auto-generated method stub
		super.delivery();
		System.out.println("Child method delivary");
	}
	
	@Override
	public void manufacture() {
		System.out.println("Invoked manufacture");
		
	}
	

}
