public class Anonymous_arr
{
	public static void sum(int[] a)
	{
		for(int i:a)
		{
			System.out.println(i);

		}
	}
	public static void main(String args[])
	{
		sum(new int[] {1,2,3});
	}
}