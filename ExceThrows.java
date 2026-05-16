class ExceThrows
{
	void devide()throws ArithmeticException
	{
		int x=17,y=0,z;
		z=x/y;
		System.out.println(z);
	}
	public static void main(String args[])
	{
		try
		{
			ExceThrows ob=new ExceThrows();
			ob.devide();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("exit");
	}
}