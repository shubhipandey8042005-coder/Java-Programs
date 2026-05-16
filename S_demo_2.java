class Pen
{
	void print()
	{
	System.out.println("First color");
	}

}
class Pencil extends Pen
{
	
	void print()
	{
		super.print();
		System.out.println("second color");
	}
}
class S_demo_2
{
	public static void main(String args[])
	{
		Pencil p=new Pencil();
		p.print();
	}
}