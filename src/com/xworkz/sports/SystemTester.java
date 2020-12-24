package com.xworkz.sports;

import com.xworkz.sports.computer.Computer;
import com.xworkz.sports.computer.Desktop;
import com.xworkz.sports.computer.Laptop;

public class SystemTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer computer=new Desktop();
		computer.computer("LENOVO", "i7");
		computer.displayComputerDetails();
		computer.displayDetails();

		computer=new Laptop();
		computer.setRAM(1000);
		System.out.println(computer.getRAM());
		Computer camp=new Laptop();
		
		Computer childRef=(Computer)camp;
		childRef.charging(3);
		if(computer instanceof Laptop)
		{
			System.out.println("Yes it is laptop");
		}else {
			System.out.println("It is not a laptop");
		}
	}

}
