package com.xworkz.constructor.init;

import com.xworkz.constructor.init.paper.Paper;

public class PaperTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main method");
		Paper paper=new Paper("Class mate","White","20px","10px");
		String brandName=paper.getBrand();
		String colorIs=paper.getColor();
		String heightOfPaper=paper.getHeight();
		String widthOfPaper=paper.getWidth();
		
		System.out.println(brandName);
		System.out.println(colorIs);
		System.out.println(heightOfPaper);
		System.out.println(widthOfPaper);

	}

}
