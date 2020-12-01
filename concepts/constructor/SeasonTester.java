package com.xworkz.constructor;

import com.xworkz.constructor.season.Season;

public class SeasonTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		
		Season season=new Season();
		String seasonStore=season.name;
		System.out.println(seasonStore);
		
		Season season1=new Season("Winter","December");
		String storeSeason=season1.name;
		String monthStart=season1.startMonth;
		System.out.println("Season name is="+storeSeason);
		System.out.println("Season Start month is ="+monthStart);
		
		Season season2=new Season("Summer");
		String nameIs=season2.name;
		System.out.println("Season Is ="+nameIs);
		
	}

}
