package com.xworkz.inheritance.dto;

public class PolicaStationDTO {

	private String area;
	private int noOfCells;
	private String name;

	public PolicaStationDTO() {
		System.out.println("Created PolicaStationDTO");
	}

	/**
	 * 
	 * @param area
	 * @param noOfCells
	 * @param name
	 */
	public PolicaStationDTO(String area, int noOfCells, String name) {
		super();
		this.area = area;
		this.noOfCells = noOfCells;
		this.name = name;
	}

	@Override
	public String toString() {
		return "PolicaStationDTO [area=" + area + ", noOfCells=" + noOfCells + ", name=" + name + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			System.out.println("Object is not null");
			if (obj == this) {
				//If the object and current instance is pointing to same object 
				System.out.println("Object is pointing to same memory");
				return true;
			} else {
				if (obj instanceof PolicaStationDTO) {
					PolicaStationDTO casted = (PolicaStationDTO) obj;
					if (casted.getName() != null || casted.getNoOfCells() != 0 || casted.getArea() != null) {
						System.out.println("name is equal");
						return true;
					} else {
						System.out.println("name is not equal");
					}
				}
			}
		}
		System.out.println("Obj is not equal");
		return false;
	}

	public String getArea() {
		return area;
	}

	public int getNoOfCells() {
		return noOfCells;
	}

	public String getName() {
		return name;
	}

}
