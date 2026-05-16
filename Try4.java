class Try4
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
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
			
	}
}