public class Try6
{
	public static void main(String args[])
	{
		int age=17;
		if(age<18)
		{
			throw new ArithmeticException("person is not eligible");

		}
		else
		{
			System.out.println("person is eligible");
		}
	}
}