public class Str_equal
{
	public static void main(String args[])
	{
		String a="HELLO";
		String b="Hello";
		if(b.equalsIgnoreCase(a))
		{
			System.out.println("Equal");
		}
		else
		{
			System.out.println("Not Equal");
		}
	}
}