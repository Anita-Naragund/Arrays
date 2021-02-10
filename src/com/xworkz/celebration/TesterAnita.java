package com.xworkz.celebration;

import com.xworkz.celebration.functional.Display;
import com.xworkz.celebration.service.DisplayService;
import com.xworkz.celebration.service.DisplayServiceImpl;

public class TesterAnita {
	public static void main(String[] args) {
		
		DisplayService service=new DisplayServiceImpl();
		service.printString((a,b)->{System.out.println("validating" +a+" " +b);
		if(a.contains("a") || a.contains("A")) {
			System.out.println(a+ " " +a.hashCode());
		}
		});
	}

}
