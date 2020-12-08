package com.xworkz.movies;

import java.util.Arrays;

public class ArrayTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] areaNames= {"RajajiNagar","Megestic","BTM","YashavanthPur","MG Road"};
		int size=areaNames.length;
		System.out.println(size);
		
		String[] countryNames= {"India","USA","Russia","Srilanka"};
		System.out.println(countryNames.length);
		
		String countryAtIndex0=countryNames[0];
		System.out.println(countryAtIndex0);
		
		countryNames[0]="USA";
		System.out.println(countryNames[0]);
		System.out.println(Arrays.toString(countryNames));
		
		String[] states=new String[50];
		System.out.println(states[0]);
		System.out.println(states[1]);
		System.out.println(states[2]);
		
		states[3]="Karnataka";
		System.out.println(states[3]);
		System.out.println(Arrays.toString(states));

	}

}
