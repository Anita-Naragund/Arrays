public class Gallary
{
	public static void main(String[] photos)
	{
		System.out.println("Invoked photo method");
		String storeIn=photos[0];
		switch(storeIn)
		{
			case "Private":
			System.out.println("Store images in private floder");
			System.out.println("Stored on Nov 8");
			break;
			
			case "Public":
			System.out.println("Store images in public floder");
			System.out.println("Stored on Nov 8");
			break;
			
			case "Cloud":
			System.out.println("Store images in cloud floder");
			System.out.println("Stored on Nov 8");
			break;
			
			default :
		System.out.println("cannot store images");
		break;
		}
		System.out.println("EXIT::main()");
	}
}