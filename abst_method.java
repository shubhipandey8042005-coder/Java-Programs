abstract class Ab
{
	abstract void show();

	void show_2()
	{
		System.out.println("hello java");

	}
}
class abst_method extends Ab
{
	void show()
	{
		System.out.println("welcome in java");
	}
	public static void main(String args[])
	{
		Ab obj=new abst_method();
		obj.show();
		obj.show_2();
	}
}