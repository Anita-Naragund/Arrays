public class Runner
{
	public static void main(String[] names)
	{
		System.out.println("JVM invokes main method");
		
		System.out.println("Program to print all the arguments of the main method");
		System.out.println("By making use og for loop,which is dynamic");
		for(int loop=0;loop<names.length;loop++)
		{
			System.out.println("loop number :"+loop);
			String mainMethodArgs=names[loop];
			System.out.println("main method args :"+mainMethodArgs);
		}
		System.out.println("EXIT::main()");
	}
}