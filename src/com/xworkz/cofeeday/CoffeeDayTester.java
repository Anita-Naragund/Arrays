package com.xworkz.cofeeday;

import com.xworkz.cofeeday.applicances.CoffeeMachine;

import com.xworkz.cofeeday.applicances.Power;
/**
 * 
 * @author Anita
 *
 */

public class CoffeeDayTester {

	public static void main(String[] args) {
		Power power = new Power();
		CoffeeMachine machine = new CoffeeMachine(power);

		boolean success = machine.grind("Civet");
		if (success) {
			System.out.println("I know grinding was done");
		} else {
			System.out.println("Grinding was not done");
		}

	}

}
