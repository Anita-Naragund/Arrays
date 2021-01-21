package com.xworkz.shop.dto;

public class AlcoholDTO {
	
	private String name;
	private String brandName;
	private double spritpercentage;
	
	public AlcoholDTO() {
		
	}

	public AlcoholDTO(String name, String brandName, double spritpercentage) {
		super();
		this.name = name;
		this.brandName = brandName;
		this.spritpercentage = spritpercentage;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [name=" + name + ", brandName=" + brandName + ", spritpercentage=" + spritpercentage + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null) {
			return false;
		}
		if(obj instanceof AlcoholDTO) {
			AlcoholDTO dto=(AlcoholDTO)obj;
			if(this.name.equals(dto.name) && this.brandName==dto.brandName) {
				System.out.println("Alcohol is matching:" +dto.name);
				return true;
			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public double getSpritpercentage() {
		return spritpercentage;
	}

	public void setSpritpercentage(double spritpercentage) {
		this.spritpercentage = spritpercentage;
	}
	
}
