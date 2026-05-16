class Array_Try
{
	public static void main(String args[])
	{
		int a[]=new int[4];
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		try
		{
			System.out.println(a[5]=60);
		}
		catch(ArrayIndexOutofBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("out of bound ");
	}
}