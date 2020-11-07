public class PhoneTester
{
	public static void main(String[] mobile)
	{
		System.out.println("Invokes main method");
		
		byte call=Phone.missedCalls;
		System.out.println("Phone call :"+call);
		
		short app=Phone.apps;
		System.out.println("Phone apps is :"+app);
		
		int num=Phone.contacts;
		System.out.println("Phone numbers are :"+num);
		
		long photos=Phone.gallary;
		System.out.println("Phone photos are :"+photos);
		
		float data=Phone.dataUsed;
		System.out.println("Phone data used is :"+data);
		
		double store=Phone.storage;
		System.out.println("Phone storage is :"+store);
		
		char key=Phone.keyboard;
		System.out.println("Keyboard  :"+key);
		
		boolean charge=Phone.chargeIsFull;
		System.out.println("Phone charge is:"+charge);
	}
}