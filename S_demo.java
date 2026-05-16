class Pen
{
	String color="Grey";
}
class Pencil extends Pen
{
	String color="Black";
	void print()
	{
		System.out.println(super.color);
		System.out.println(color);
	}
}
class S_demo
{
	public static void main(String args[])
	{
		Pencil p=new Pencil();
		p.print();
	}
}