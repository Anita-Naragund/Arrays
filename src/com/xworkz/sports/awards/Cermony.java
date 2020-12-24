package com.xworkz.sports.awards;

public class Cermony {
	private String name;
	private String[] foods;

	public Cermony() {
		System.out.println("created Cermony");
	}

	public void distributedAwards(String personName, String award) {
		System.out.println("Invoked main");
		System.out.println("args 1 :" + personName);
		System.out.println("args 2 :" + award);
	}

	public void displayFoods() {
		System.out.println("Invoked displayFoods");
		System.out.println(this.foods);
		if (this.foods != null) {
			for (int i = 0; i < this.foods.length; i++) {
				String food = this.foods[i];
				System.out.println(food);
			}
		}
	}

	public void displayCermonyNameAndFoods() {
		System.out.println(this.name);
		this.displayFoods();
	}

	public void accessParentMethods() {
		int hcode = super.hashCode();
		System.out.println(hcode);
		String str = super.toString();
		System.out.println(str);
	}

	public Cermony(String name) {
		this.name = name;
	}

	public void setFoods(String[] foods) {
		this.foods = foods;
	}

}
