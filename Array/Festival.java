public class Festival
{
public static void main(String[] politicians)
{
	System.out.println("JVM invokes main");
	String[] ministersArray={"BSY","HDK","Siddaramiah","Jagadish Shettar","S M Krishna"};
	
	chiefMinisters(ministersArray);
	System.out.println("exit main");
}
public static void chiefMinisters(String[] names){
	System.out.println("chiefMinisters :"+names);
	int size=names.length;
	System.out.println(size);
	String elementAtIndex0=names[0];
	System.out.println("Chief Minister @ index 0"+elementAtIndex0);
	System.out.println("Chief Minister @ index 1"+names[1]);
	System.out.println("Chief Minister @ index 10"+names[2]);
	
}}