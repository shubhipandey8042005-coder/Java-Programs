class A
{
	void msg()
	{
		System.out.println("parent class");
	}
	
}
class B extends A
{
	void display()
	{
		System.out.println("child class");
	}
}
class C extends A
{
	void show()
	{
		System.out.println("sub class");
	}
}
class Heirar_inherit
{
	public static void main(String args[])
	{
	        B ab=new B();
		ab.display();
		ab.msg();
		C ac=new C();
		ac.show();
		ab.msg();
		
	}
		
	
}