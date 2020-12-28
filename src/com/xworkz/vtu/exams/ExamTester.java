package com.xworkz.vtu.exams;

public class ExamTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam exam = new Exam();
		System.out.println(Exam.getUniversityName());
		exam.setCode("15EC81");
		exam.setFees(1400);

		HallTicket hallTicket = new HallTicket("3vc16cs", 8, "Sushmitha");

		boolean allowed = exam.allow(hallTicket);
		if (allowed) {
			System.out.println("can write exam");
		} else {
			System.out.println("cannot write exam");
		}

		
		SupplementaryExam supplementaryExam=new SupplementaryExam();
		System.out.println(supplementaryExam.getUniversityName());

	}

	}

}
