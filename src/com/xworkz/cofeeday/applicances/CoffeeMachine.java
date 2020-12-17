package com.xworkz.cofeeday.applicances;

public class CoffeeMachine {
	private Power power;

	//CoffeeMachine constructor is created with power as a power
	public CoffeeMachine(Power power) {
		System.out.println("Initilize CoffeeMachine");
		this.power = power;
	}

	//grind() in this method I am checking that power is passing or not
	public boolean grind(String bean) {
		System.out.println("invoked grid");
		if (bean != null) {
			boolean grinding = this.power.generatePower();
			if (grinding) {
				System.out.println("Grinding :" + bean);
				return true;
			} else {
				System.out.println("Grinding is false");
				return false;
			}
		} else {
			System.out.println("Bean is not there");
			return false;
		}
	}
}
