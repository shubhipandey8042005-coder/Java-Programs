class A implements Runnable  //predefine class 
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("A Numbers are:"+i);
		}	
	}	
}
class B implements Runnable
{
	public void run()
	{
		for(int j=1;j<=10;j++)
		{
			System.out.println("B Numbers are:"+j);
		}	
	}	
}
class Th_demo2
{
	public static void main(String args[])
	{
		A ob=new A();
		Thread ob2=new Thread(ob);
		ob2.start();
		B oc=new B();
		Thread oc3=new Thread(oc);
		oc3.start();	
		 
	}
}