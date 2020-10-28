public class StringConverter
{
	public static void main(String[] values)
	{
		System.out.println("Invoke main method");
		System.out.println("The system will convert String into Number");
		
		String fingersInHand="126";
		byte convertedFinger=Byte.parseByte(fingersInHand);
		System.out.println("String to Byte :"+convertedFinger);
		
		
		String salary="28000";
		
		short convertedSalary=Short.parseShort(salary);
		System.out.println("String to short :"+convertedSalary);
		
		
		String forestAreaInIndia="754252";
		int convertedArea=Integer.parseInt(forestAreaInIndia);
		System.out.println("String to integer :"+convertedArea);
		
		
		String oneMillionInRupees="73358800";
		long convertRupees=Long.parseLong(oneMillionInRupees);
		System.out.println("String to Long :"+convertRupees);
		
		
		String valueOfPie="3.142";
		float convertedPie=Float.parseFloat(valueOfPie);
		System.out.println("String to Float :"+convertedPie);
		
		
		String massOfNeutron="1.67493";
		double convertedMass=Double.parseDouble(massOfNeutron);
		System.out.println("String to double :"+convertedMass);
		
		
		String flag="true";
		boolean convertedFlag=Boolean.parseBoolean(flag);
		System.out.println("String to boolean :"+convertedFlag);
		
		
		System.out.println("EXIT :main()");
	}
	
}