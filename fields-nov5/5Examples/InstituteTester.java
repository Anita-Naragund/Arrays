public class InstituteTester
{
	public static void main(String[] tester)
	{
		System.out.println("Invokes main method");
		
		short staff=Institute.staffInInstitute;
		System.out.println("Total staff in Institute "+staff);
		
		int student=School.noOfStudents;
		System.out.println("total number studets :"+student);
		
		byte member=Home.oldMembersInHouse;
		System.out.println("Old members in house :"+member);
		
		short ward=Hospital.wardsInHospital;
		System.out.println("Number of wards in hoapital"+ward);
		
		String carBrand=Car.brand;
		System.out.println("Car brand is "+carBrand);
		
	}
}