package com.xworkz.engineer;

import com.xworkz.engineer.VTU.CSEngineer;
import com.xworkz.engineer.VTU.Engineer;
import com.xworkz.engineer.constants.Branches;

public class EngineerTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Engineer eng = new Engineer();

		Engineer childRef = new CSEngineer();
		eng.setUsn("2KA16IS007");
		eng.setName("Anita");
		eng.setBranch(Branches.IS);
		System.out.println(eng.getUsn());
		System.out.println(eng.getName());
		System.out.println(eng.getBranch());

		eng.problemSolving();
		childRef.problemSolving();
	}
}
