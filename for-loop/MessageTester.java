
public class MessageTester
{
	public static void main(String[] msgs)
	{
		System.out.println("JVM invokes main method");
		String valueAtIndex0=msgs[0];
		int number=Integer.parseInt(valueAtIndex0);
		VTU.printMessage();
		VTU.printMessage(number);
	
		System.out.println("........................");
		VTU.groupMessagesAndLoop();
		System.out.println("EXIT::main()");
	}
}