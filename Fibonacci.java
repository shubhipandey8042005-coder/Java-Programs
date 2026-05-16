import java.util.*;
public class Fibonacci
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter a no");
		int n=scan.nextInt();
		int a=0,b=1;
		int c;
		System.out.println("number is:"+n);
		System.out.println("  "+b);
		for(int i=3;i<9;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println("  "+c);
		}
		
	}
}