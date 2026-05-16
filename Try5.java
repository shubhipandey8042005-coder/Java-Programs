class Try5
{
	public static void main(String args[])
	{
		try
		{
			try
			{
				int data=10/0;
				try
				{
					int arr[]=new int[3];
					arr[0]=10;
					arr[1]=20;
					arr[2]=30;
					System.out.println(arr[6]=40);
				}
				catch(Exception e)
				{
					System.out.println(e);

				}
			}
				catch(Exception e)
				{
					System.out.println(e);
				}
		}
				catch(Exception e)
				{
					System.out.println(e);
				}
		
			
					
		
	}
}