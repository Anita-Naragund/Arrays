public class IPhoneTester
{
public static void main(String[] models)
{
	System.out.println("JVM invoke main method");
	IPhone.call();
	boolean connect=true;
	System.out.println("charge is connected:"+connect);
	
	IPhone.message();
	System.out.println("call message()");
	System.out.println("Exit::main method");
}
 
}