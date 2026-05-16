import java.util.*;
public class Factor
{
	public static void main(String args[])
	{
		int i,n=20;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(" "+i);
			}
		}
	}
}