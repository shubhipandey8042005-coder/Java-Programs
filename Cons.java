class Add
{
	int x; String y;
	Add()
	{
		x=10; y="deepanjali";
	}
	void show()
	{
		System.out.println(x+" "+y);
	}
}
class Cons
{
	public static void main(String args[])
	{
		Add ob=new Add();
		ob.show();
	}
}