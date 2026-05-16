class Try
{
	public static void main(String args[])
	{
		try
		{
			int data=10/0;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
		}
		System.out.println("out of bound");	
	}
}