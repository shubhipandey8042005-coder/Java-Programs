class Single_inherit
{
	void add()
	{
		int a,b,c;
		a=5;
		b=10;
		c=a+b;
		System.out.println("Addition is:"+c);
	}
	void mul()
	{
		int a,b,c;
		a=5;
		b=5;
		c=a*b;
		System.out.println("Subtraction is:"+c);
	}
	
}
class In extends Single_inherit
{
	void sub()
	{
		int a,b,c;
		a=20;
		b=10;
		c=a-b;
		System.out.println("Subtraction is:"+c);
	}
	void div()
	{
		int a,b,c;
		a=5;
		b=5;
		c=a/b;
		System.out.println("Division is:"+c);
	}
}
class Inherit_calc
{
	public static void main(String args[])
	{
		In ab=new In();
		ab.sub();
		ab.add();
		ab.mul();
		ab.div();
	}
		
	
}