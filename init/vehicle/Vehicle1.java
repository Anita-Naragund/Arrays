package com.xworkz.constructor.init.vehicle;

public class Vehicle1 {
	
		private String company;
		private String mfgDate;
		private int chasisNo;
		private String color;
		private String ownerName;
		
		public Vehicle1(String company,String mfgDate,int chasisNo)
		{
			System.out.println("Create Vehicle");
			this.company=company;
			this.mfgDate=mfgDate;
			this.chasisNo=chasisNo;
		}

		public String getCompany() {
			return company;
		}

		public String getMfgDate() {
			return mfgDate;
		}

		public int getChasisNo() {
			return chasisNo;
		}

		public void setColor(String color)
		{
			this.color=color;
			System.out.println(color);
		}
		public void setOwnerName(String ownerName)
		{
			this.ownerName=ownerName;
			System.out.println(ownerName);
		}

	}



