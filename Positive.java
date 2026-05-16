import java.util.*;
public class Positive
{
	public static void main(String args[])
	{
		int number;
		Scanner scan=new Scanner(System.in);                                                    
		System.out.println("enter a number:");
		number=scan.nextInt();
		System.out.println("no is:"+number);
		if(number>0)
		{
			System.out.println("positive no");
			
		}
		else if(number<0)
		{
			System.out.println("negative no");
		}
		
	}
}
