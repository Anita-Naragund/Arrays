public class IPhone
{
public static boolean call()
{
System.out.println("Invoked");
boolean connected=true;
return connected;
}


public static String message()
{
	System.out.println("GM message is printed");
	String msg="Good Morning";
	System.out.println("Text Message :"+msg);
	return msg;
}

public static byte charging(double volts)
{
	System.out.println("invoked charging()");
	System.out.println("Volts :" +volts);
	if(volts>3)
	{
		System.out.println("volts is greater than 3");
		return 100;
	}
	if(volts<3 && volts>0)
	{
		System.out.println("volts is less than 3");
		return 0;
	}
	return -1;
}
}