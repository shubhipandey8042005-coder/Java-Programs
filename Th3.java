public class Th3 extends Thread
{
	public void run() 
	{
		for(int i=1;i<=10;i++)
		
		try
		{
			System.out.println(i);
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
		}	
	}
	public static void main(String args[])
	{
		Th3 ob=new Th3();
		ob.start();

		
	}
}