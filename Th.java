public class Th extends Thread
{
	public void run()
	{
		System.out.println("java");
		System.out.println("c++");	
	}
	public static void main(String args[])
	{
		Th ob=new Th();
		Th oc=new Th();
		System.out.println(ob.isAlive());
		oc.start();
		System.out.println(oc.isAlive());   //true coz we call already oc before
		ob.start();
		
	}
}