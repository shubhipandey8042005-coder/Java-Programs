class Single_inherit
{
	void msg()
	{
		System.out.println("parent class");
	}
	
}
class In extends Single_inherit
{
	void display()
	{
		System.out.println("child class");
	}
}
class Inherit_prg
{
	public static void main(String args[])
	{
		In ab=new In();
		ab.display();
		ab.msg();
	}
		
	
}