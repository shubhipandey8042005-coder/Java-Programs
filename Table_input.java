import java.util.*;
public class Table_input
{
	public static void main(String args[])
	{
		int i,no;
		Scanner obj= new Scanner(System.in);
		System.out.println("enter a no:");
		no=obj.nextInt();
		i=1;
		while(i<=10)
		{
			System.out.println(no+"*"+i+"="+no*i);
			i++;
		}
		
	}
}