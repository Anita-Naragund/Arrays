package com.xworkz.engineer.VTU;

import com.xworkz.engineer.constants.Branches;

public class Engineer {
	private String usn;
	private String name;
	private Branches branch;
	
	public void problemSolving()
	{
		System.out.println("invoked problemSolving");
		System.out.println("Branches are :"+Branches.MECH);
	}

	public String getUsn() {
		return usn;
	}

	public void setUsn(String usn) {
		this.usn = usn;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Branches getBranch() {
		return branch;
	}

	public void setBranch(Branches branch) {
		this.branch = branch;
	}
}
