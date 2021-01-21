package com.xworkz.shop.dto;

public class ShoppingCartDTO {
	
	private String itemName;
	private int quantity;
	private double price;
	
	public ShoppingCartDTO() {
		System.out.println("ShoppingCartDTO");
	}
	@Override
	public boolean equals(Object obj) {
		//System.out.println("This is the equals method");
		//return super.equals(arg0);
		if(obj==null) {
			return false;
		}
		if(obj instanceof ShoppingCartDTO) {
			ShoppingCartDTO dto=(ShoppingCartDTO)obj;
			if(this.itemName.equals(dto.itemName) && this.price==dto.price) {
				System.out.println("Item is matching:" +dto.itemName);
				return true;
			}
		}
		return false;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	

}
