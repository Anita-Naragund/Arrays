public class InstituteTester
{
	public static void main(String[] photos)
	{
		System.out.println("Invoked main doing enum ");
		InstituteFinder.lowestAndBestestUsingString("ABC");
		String instituteName="XWORKZ";
		Institute enumInstituteName=Institute.valueOf(instituteName);
		InstituteFinder.lowestAndBestestUsingEnum(enumInstituteName);
		
		System.out.println("EXIT::main()");
		
		
	}
}
