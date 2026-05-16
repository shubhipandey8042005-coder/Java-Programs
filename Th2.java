public class Th2 extends Thread
{
	public void run() 
	{
		System.out.println("java");
		try
		{
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}
		System.out.println("vb");	
	}
	public static void main(String args[])
	{
		Th2 ob=new Th2();
		ob.start();

		
	}
}