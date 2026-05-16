public class Static_method
{
	public static void main(String args[])
	{
		Static_method ob=new Static_method();
		ob.display();
		Std.show();
	}
	public void display()
	{
		System.out.println("Non static method");
	}
}
class Std
{
	static void show()
	{
		System.out.println("static method");
	}
}