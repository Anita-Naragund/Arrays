package com.xworkz.inheritance.state;

public class Clay extends Alumina {
	
	public Clay()
	{
		System.out.println("Constuctor Caly");
	}
	@Override
	public void manufacture() {
		// TODO Auto-generated method stub
		super.manufacture();
		System.out.println("Reference");
	}

}
