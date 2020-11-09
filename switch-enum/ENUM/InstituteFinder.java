public class InstituteFinder
{
public static void lowestAndBestestUsingString(String instituteName)
{
	System.out.println("Invoked main using enum ");
	System.out.println("arg 1 instituteName :"+instituteName);
	switch(instituteName)
	{
		case "XWORKZ":
		System.out.println("case is :"+instituteName);
		System.out.println("Entriprise development");
		System.out.println("cost is 20k");
		break;
		
		case "ABC":
		System.out.println("case is :"+instituteName);
		System.out.println("java");
		System.out.println("cost is 30k");
		break;
		
		case "PENTAGON":
		System.out.println("case is :"+instituteName);
		System.out.println("Python");
		System.out.println("cost is 50k");
		break;
		
		case "JSPIDER":
		System.out.println("case is :"+instituteName);
		System.out.println("Java and JEE");
		System.out.println("cost is 32k");
		break;
		
		case "SOCKEXPERT":
		System.out.println("case is :"+instituteName);
		System.out.println("Cyber Security");
		System.out.println("cost is 40k");
		break;
		default: 
		System.out.println("No institute found");	
	}
	System.out.println("EXIT::main");
}
public static void lowestAndBestestUsingEnum(Institute instituteName)
{
	System.out.println("Invoked main using enum ");
	System.out.println("arg 1 instituteName :"+instituteName);
	switch(instituteName)
	{
		case XWORKZ:
		System.out.println("case is :"+instituteName);
		System.out.println("Entriprise development");
		System.out.println("cost is 20k");
		break;
		
		case ABC:
		System.out.println("case is :"+instituteName);
		System.out.println("java");
		System.out.println("cost is 30k");
		break;
		
		case PENTAGON:
		System.out.println("case is :"+instituteName);
		System.out.println("Python");
		System.out.println("cost is 50k");
		break;
		
		default: 
		System.out.println("No institute found");
	}
	System.out.println("EXIT::main");
}
}
