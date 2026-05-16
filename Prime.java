import java.util.*;
public class Prime
{
	public static void main(String args[])
	{
		int no=50,i,p=0;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a no:");
		no=obj.nextInt();
		for(i=2;i<no;i++)
	{
		if(no%i==0)
		{
			p++;
		}
	}
		if(p==0)
		{
			System.out.println("prime no");
		}
		else
		{
			
			System.out.println("not a prime no");
				
		}
	}
}