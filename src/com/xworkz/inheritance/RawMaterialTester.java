package com.xworkz.inheritance;

import com.xworkz.inheritance.scheme.RawMaterial;
import com.xworkz.inheritance.state.Alumina;
import com.xworkz.inheritance.state.Clay;

public class RawMaterialTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RawMaterial rawmaterial = new Alumina();
		rawmaterial.delivery();
		rawmaterial.manufacture();
		
		rawmaterial=new Clay();
		rawmaterial.manufacture();
	}

}
