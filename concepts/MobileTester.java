package com.xworkz.concepts;

import com.xworkz.concepts.phone.Mobile;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Invoked main");
		Mobile.OS="Android";
		Mobile mobile=new Mobile();
		mobile.model="Reno 2F";
		mobile.companyName="OPPO";
		mobile.color="Blue";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile2=new Mobile();
		mobile.model="9 Pro";
		mobile.companyName="Redmi";
		mobile.color="Black";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile3=new Mobile();
		mobile.model="M11";
		mobile.companyName="Samsung";
		mobile.color="Purple";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile4=new Mobile();
		mobile.model="A37F";
		mobile.companyName="OPPO";
		mobile.color="Pink";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile5=new Mobile();
		mobile.model="Note 7";
		mobile.companyName="MI";
		mobile.color="White";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile6=new Mobile();
		mobile.model="M2";
		mobile.companyName="POCO";
		mobile.color="Black";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile7=new Mobile();
		mobile.model="7 Pro";
		mobile.companyName="One Plus";
		mobile.color="Blue";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile8=new Mobile();
		mobile.model="9 Pro";
		mobile.companyName="Xiaomi";
		mobile.color="Red";
		mobile.displayInfo();
		System.out.println("******************");
		
		Mobile mobile9=new Mobile();
		mobile.model="G9";
		mobile.companyName="Moto";
		mobile.color="Purple";
		mobile.displayInfo();
		
		System.out.println("******************");
		
		

	}

}
