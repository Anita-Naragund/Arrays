package com.xworkz.cosmetics.dto;

import com.xworkz.cosmetics.constants.Shades;
import com.xworkz.cosmetics.constants.Type;

public class CosmeticDTO {
	private String brand;
	private Shades shades;
	private Type type;
	private double price;
	private int quantity;

	public CosmeticDTO() {
		System.out.println("Craeted CosmeticDTO");
	}

	public CosmeticDTO(String brand, Shades shades, Type type, double price, int quantity) {
		super();
		this.brand = brand;
		this.shades = shades;
		this.type = type;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Shades getShades() {
		return shades;
	}

	public void setShades(Shades shades) {
		this.shades = shades;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "CosmeticDTO [brand=" + brand + ", shades=" + shades + ", type=" + type + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			CosmeticDTO converted = (CosmeticDTO) obj;
			if (this.brand != null && this.type != null) {
				if (this.brand.equals(converted.getBrand()) && this.type.equals(converted.getType())) {
					System.out.println("objects are equal ");
					return true;
				}
			}
		}
		System.out.println("Object is already there in dto");
		return false;
	}

}
