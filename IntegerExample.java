import java.util.*;
public class IntegerExample
{
	public static void main(String args[])
	{
		Scanner ob=new Scanner(System.in);
		System.out.println("enter your number:");
		int number=ob.nextInt();
		System.out.println("number is:"+number);
		ob.close();
	}
}