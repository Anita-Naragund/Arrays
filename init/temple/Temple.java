package com.xworkz.constructor.temple;

public class Temple {
	private String name;
	private float startTime;
	private String location;
	private String prasada;
	private float closeTime;
	
	public Temple()
	{
		System.out.println("Create Temple constructor");
	}
	
	public Temple(String name,float startTime,String location,String prasada,float closeTime)
	{
		System.out.println("Create Temple");
		this.name=name;
		this.startTime=startTime;
		this.location=location;
		this.prasada=prasada;
		this.closeTime=closeTime;
	}

	public String getName() {
		return name;
	}

	public float getStartTime() {
		return startTime;
	}

	public String getLocation() {
		return location;
	}

	public String getPrasada() {
		return prasada;
	}

	public void setPrasada(String prasada) {
		this.prasada = prasada;
	}

	public float getCloseTime() {
		return closeTime;
	}

}
