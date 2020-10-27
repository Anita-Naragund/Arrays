public class Percentage
{
public static byte percentageRange(double percentage)
{
System.out.println("Invoke percentage :"+percentage);
if(percentage>=0 && percentage<=34)
{
	System.out.println("Student is failed in exam");
	return 1;
}
if(percentage>=35 && percentage<=50)
{
	System.out.println("Student passed with third class in exam");
	return 2;
}
if(percentage>=51 && percentage<=65)
{
	System.out.println("Student passed with second class in exam");
	return 3;
}
if(percentage>=66 && percentage<=80)
{
	System.out.println("Student passed with First calss in exam");
	return 4;
}
if(percentage>=81 && percentage<=34)
{
	System.out.println("Student passed with  Distinction in exam");
	return 5;
}
return 0;
}
}