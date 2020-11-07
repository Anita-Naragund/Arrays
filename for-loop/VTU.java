public class VTU
{
	public static void printMessage()
	{
		for(int msg=0;msg<=8;msg++)
		{
			System.out.println("Shaping the future");
		}
	}
	public static void printMessage(int loopSize)
	{
		for(int msg=0;msg<=loopSize;msg++)
		{
			System.out.println("Shaping the future"+msg);
		}
		
	}
	public static void groupMessagesAndLoop()
	{
		System.out.println("invoked groupMessagesAndLoop");
	    String[] message={"Good Morning","Updates are available","memory is Full","battery is full","Shut down the system"};
		System.out.println("message size "+message.length);
		
		for(int count=0;count<=message.length;count++)
		{
			System.out.println("count :"+count);
			String messages=message[count];
			System.out.println("messages "+messages);
		}
	}
}