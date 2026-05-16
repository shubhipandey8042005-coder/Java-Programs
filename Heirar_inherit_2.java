class A
{
	void add()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a+b;
		System.out.println("Addition is "+c);
	}
	void mul()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a*b;
		System.out.println("Multiplication is "+c);
	}
	
}
class B extends A
{
	void sub()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a-b;
		System.out.println("Subtraction is "+c);
	}
}
class C extends A
{
	void div()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a/b;
		System.out.println("Division is "+c);
	}
	void module()
	{
		int a,b,c;
		a=10;
		b=10;
		c=a%b;
		System.out.println("Modulus is "+c);
	}
	
}
class Heirar_inherit_2
{
	public static void main(String args[])
	{
	        B ab=new B();
		ab.add();
		ab.mul();
		ab.sub();
		C ac=new C();
		ac.div();
		ac.module();
		
	}
		
	
}