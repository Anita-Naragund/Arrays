package com.xworkz.vtu.exams;

public class SupplementaryExam {
	public static String universityName = "VTU MANGALORE";
	//<init>
	public SupplementaryExam() {
		
	System.out.println("invoked SupplementaryExam const");
	}
	
	public SupplementaryExam(String name)
	{
		System.out.println("calling over loaded const suppl");
	}

	public boolean allow(HallTicket hallTicket) {
		System.out.println("invoked allow from SupplementaryExam");
		return false;
		
	}

	public static String getUniversityName() {
		return universityName;
	}
}

