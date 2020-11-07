public class LoopTester
{
	public static void main(String[] display)
	{
		System.out.println("JVM invoked main");
		boolean termination=true;
		for(byte start=0;termination;start++)
		{
			System.out.println("Infinite");
			System.out.println("Value of init valriable :"+start);
			if(start==3)
			{
				termination=false;
			}
		}			

	//System.out.println("EXIT::main()");
	}
}