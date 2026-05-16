public class StrBuilder2
{
	public static void main(String args[])
	{
		StringBuilder ob=new StringBuilder("Hello");
		ob.delete(1,3);
		System.out.println(ob);
	}
}