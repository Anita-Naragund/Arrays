package com.xworkz.engineer.VTU;

import com.xworkz.engineer.constants.Branches;

public class CSEngineer extends Engineer{
	public void problemSolving()
	{
		System.out.println("Invoked child method problemSolving");
		System.out.println("Branches are :"+Branches.CS);
	}
}
