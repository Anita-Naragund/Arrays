public class Age
{
public static void main(String[] ageIs)
{
	System.out.println("JVM invoke main method");
	byte range=AgeLimit.lifeSpan(15);
	System.out.println("range of age :"+range);
	System.out.println("Exit::main");
}
}