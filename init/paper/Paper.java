package com.xworkz.constructor.init.paper;

public class Paper {
	private String brand="Class Mate";
	public String color;
	String width;
	String height;
	public Paper(String brand,String color,String width,String heigth)
	{
		System.out.println("Create paper");
		this.color=color;
		this.height=heigth;
		this.width=width;
	}
	public String getBrand() {
		return brand;
	}
	public String getColor() {
		return color;
	}
	public String getWidth() {
		return width;
	}
	public String getHeight() {
		return height;
	}
}
