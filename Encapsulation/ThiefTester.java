public class ThiefTester
{
	public static void main(String[] runT)
	{
		System.out.println("JVM invokes main method");
		Thief.steal();
		System.out.println("EXIT::main");
	}

}