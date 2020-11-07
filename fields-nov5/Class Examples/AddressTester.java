public class AddressTester
{
	public static void main(String[] values)
	{
		System.out.println("invoked main");
		
		short door=Address.doorNo;
		System.out.println("Door number is :"+door);
		
		door=354;
		System.out.println("Door number is :"+door);
		
		String area=Address.street;
		System.out.println("Door number is :"+area);
		
		String place=Address.city;
		System.out.println("Door number is :"+place);
		
		place="Mysore";
		System.out.println("Door number is :"+place);
		
		int pin=Address.pinCode;
		System.out.println("Door number is :"+pin);
	}
}