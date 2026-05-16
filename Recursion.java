class Recursion
{
	int sum(int b)
	{
		if(b>0)
		{
			return b+sum(b-1);
		}
		else
		{
			return 0;
		}
	}
	public static void main(String args[])
	{
		Recursion ob=new Recursion();
		int a=ob.sum(3);
		System.out.println(a);
	}
}