class A extends Thread   //predefine class 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==3)
			{
				yield();
			}
			try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}
			if(i==7)
			{
				stop();
			}
			
		}	
	}	
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("yield work");
			/*try
			{
				Thread.sleep(2000);
			}
			catch(Exception e)
			{
			}*/
			

			
		}	
	}	
}
class Th_demo6
{
	public static void main(String args[])
	{
		A ob= new A();
		B oc= new B();
		oc.setPriority(10);
		ob.start();
		oc.start();
		
		
	}
}