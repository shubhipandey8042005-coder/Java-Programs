class A extends Thread   //predefine class 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("A Numbers are:"+i);
		}	
	}	
}
class B extends Thread
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("B Numbers are:"+j);
		}	
	}	
}
class Th_demo3
{
	public static void main(String args[])
	{
		A ob= new A();
		B oc= new B();
		oc.start();
		oc.setPriority(10);
		ob.start();
		ob.setPriority(1);
		
	}
}