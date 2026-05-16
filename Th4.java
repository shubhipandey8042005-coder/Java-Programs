public class Th4 extends Thread
{
	public void run()
	{
		System.out.println("java");
		System.out.println("c++");	
	}
	public static void main(String args[])
	{
		Th4 ob=new Th4();
		Th4 oc=new Th4();
		ob.start();
		try
		{
			ob.join();	
		}
		catch(Exception e)
		{
		}
		oc.start();
	}
}