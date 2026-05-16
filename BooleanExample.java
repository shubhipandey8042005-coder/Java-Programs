import java.util.*;
public class BooleanExample
{
	public static void main(String args[])
	{
		String s="hello,this is JavaTpoint.";
		Scanner scan = new Scanner(s);
		System.out.println("Boolean result:"+scan.hasNext());
		System.out.println("String:"+scan.nextLine());
		scan.close();
		System.out.println("-----enter your details-----");
		Scanner in= new Scanner(System.in);
		System.out.print("enter your name:");
		String name=in.next();
		System.out.println("Name:"+name);
		System.out.println("enter your age:");
		int i=in.nextInt();
		System.out.println("Age:"+i);
		System.out.print("enter your salary");
		double d=in.nextDouble();
		System.out.println("salary:"+d);
		in.close();

	}
}