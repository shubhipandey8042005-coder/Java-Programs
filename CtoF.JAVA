import java.util.*;
public class Ctof
{
	public static void main(String args[])
	{
		float cel,feh;
		Scanner scan=new Scanner(System.in);
		System.out.println("enter temperature in celsius:");
		cel=scan.nextFloat();
		feh=32+(cel*9/5);
		System.out.println("temperature in Fahrenheit+"+feh);
	}	
}