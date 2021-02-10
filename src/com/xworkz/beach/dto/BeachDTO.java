package com.xworkz.beach.dto;

public class BeachDTO implements Comparable<BeachDTO> {
	
	private String name;
	private int noOfResorts;
	private int noOfIceLand;
	
	public BeachDTO() {
		System.out.println("Created BeachDTO");
	}


	public BeachDTO(String name, int noOfResorts, int noOfIceLand) {
		super();
		this.name = name;
		this.noOfResorts = noOfResorts;
		this.noOfIceLand = noOfIceLand;
	}

	@Override
	public String toString() {
		return "BeachDTO [name=" + name + ", noOfResorts=" + noOfResorts + ", noOfIceLand=" + noOfIceLand + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getNoOfResorts() {
		return noOfResorts;
	}


	public void setNoOfResorts(int noOfResorts) {
		this.noOfResorts = noOfResorts;
	}


	public int getNoOfIceLand() {
		return noOfIceLand;
	}


	public void setNoOfIceLand(int noOfIceLand) {
		this.noOfIceLand = noOfIceLand;
	}


	@Override
	public int compareTo(BeachDTO o) {
		System.out.println("invoked compareTo");
		//if(this.name.equals(o.name))returns 0;
		int tempCompare=this.name.compareTo(o.getName());
		//int tempCompare=this.name.compareTo(o.getName());//asc
		System.out.println(tempCompare);
		return tempCompare;
	}
	
	public int compareToResort(BeachDTO o) {
		System.out.println("invoked compareToResort");
		if(this.noOfResorts==o.noOfResorts) {
			System.out.println("equals :"+noOfResorts);
			return 0;
		}
		
		if(this.noOfResorts>o.noOfResorts) {
			System.out.println("greater :"+noOfResorts);
			return 100;
		}
		
		if(this.noOfResorts<o.noOfResorts) {
			System.out.println("lesser :"+noOfResorts);
			return -10;
		}
		return 0;
	}
}
