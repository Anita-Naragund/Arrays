package com.xworkz.inheritance;

import com.xworkz.inheritance.scheme.UnionGovernment;
import com.xworkz.inheritance.state.KarnatakaGovernment;

public class StateTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		UnionGovernment government = new KarnatakaGovernment();
		government.atalPensionYogana();

		Number number = new Integer(56);
		number = new Double(78);
		// abstract met

	}

}
