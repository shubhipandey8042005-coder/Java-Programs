class Pen
{
	Pen()
	{
	System.out.println("First color");
	}

}
class Pencil extends Pen
{
	
	Pencil()
	{
		
		System.out.println("second color");
	}
}
class S_constructor
{
	public static void main(String args[])
	{
		Pencil p=new Pencil();
		
	}
}