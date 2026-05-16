class Simple_nestedif
{
	public static void main(String args[])
	{
		int a,b,c;
		a=50;
		b=60;
		c=70;
			if(a>b)
			{
				if(a>c)
				{
				System.out.println("a is largest");
				}
				else
				{
					System.out.println("c is largest");
				}
			}
			else
			{
				if(b>c)
				{
				System.out.println("b is largest");
				}
				else
				{
				System.out.println("c is largest");
				}
			}
		
	}
}