public class Thief
{
	public static void steal()
	{
		System.out.println("invoked main");
		double pocket=Reliance.getBudget();
		System.out.println("Steal budget "+pocket);
		//Reliance.budget=0;
		//System.out.println("Reliance budget "+Reliance);
		System.out.println("EXIT::main");
	}
}