public class CarBrand
{
	public static void main(String[] car)
	{
		System.out.println("Invoked main method");
		getBrands();
	}
	
	
	public static String[] getBrands()
	{
		System.out.println("Invoked getBrands method");
		String[] brands={"Mahindra","fortuner","Jeep Compas","Duster","Audi"};
		
		for(int start=0;start<brands.length;start++)
		{
			System.out.println("Car Brand name is "+brands[start]);
		}
		return brands;
	}
}