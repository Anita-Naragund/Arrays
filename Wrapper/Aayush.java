public class Aayush
{
public static String lifeSpan(int personAge)
	{
		System.out.println("personAge limit :"+personAge);
		if(personAge>=1 && personAge<=5)
		{
			System.out.println("personAge of a kid is :"+personAge);
			return "1";
		}
		if(personAge>=6 && personAge<=13)
		{
			System.out.println("personAge of a child is :"+personAge);
			return "2";
		}
		if(personAge>=14 && personAge<=19)
		{
			System.out.println("personAge of a teen is :"+personAge);
			return "3";
		}
		if(personAge>=20 && personAge<=50)
		{
			System.out.println("personAge of a adult is :"+personAge);
			return "4";
		}
		if(personAge>=50 && personAge<=100)
		{
			System.out.println("personAge of a old is :"+personAge);
			return "5";
		}
		return "0";
		}
		}