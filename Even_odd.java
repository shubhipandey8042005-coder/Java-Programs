import java.util.*;
public class h
{
	private static Scanner sc;
	public static void main(String args[])
	{
		int number,i;
		sc=new Scanner(System.in);
		System.out.println("enter a number:");
		number=sc.nextInt();
		i=1;
		do
		{
			if(i%2!=0)
			{
				System.out.println(i+"\t");
			}
			i++;
			
		}while(i<=number);
	}
		

}