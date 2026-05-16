
import java.util.*;
public class Factorial
{
	public static void main(String args[])
	{
		int i,n,f=1;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter a no");
		n=obj.nextInt();
		i=1;
		while(i<=n)
		{
		f=f*i;
		i++;
		}
		System.out.println("factorial is:"+f);
		
	}
	
}