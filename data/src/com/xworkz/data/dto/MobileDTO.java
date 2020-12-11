package com.xworkz.data.dto;

public class MobileDTO {
	private String companyName;
	private String color;
	private String version;
	private String OS;

	private int price;
	private int RAM;
	private int ROM;

	public MobileDTO() {
		System.out.println("Created MobileDTO");
	}

	public MobileDTO(String companyName, String color, String version, String OS, int price, int RAM, int ROM) {
		this.companyName = companyName;
		this.color = color;
		this.version = version;
		this.OS = OS;

		this.price = price;
		this.RAM = RAM;
		this.ROM = ROM;
	}

	public String getCompanyName() {
		return companyName;
	}

	public String getColor() {
		return color;
	}

	public String getVersion() {
		return version;
	}

	public String getOS() {
		return OS;
	}

	public int getPrice() {
		return price;
	}

	public int getRAM() {
		return RAM;
	}

	public int getROM() {
		return ROM;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setRAM(int rAM) {
		RAM = rAM;
	}

	public void setROM(int rOM) {
		ROM = rOM;
	}
}