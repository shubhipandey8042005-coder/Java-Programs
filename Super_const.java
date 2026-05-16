class Sqr
{
	Sqr(int a)
	{
		int b;
		b=a*a;
		System.out.println("Square is="+b);
	}
}
class Cube extends Sqr
{
	Cube()
	{
		super(5);          
		int a,b;
		a=10;
		b=a*a*a;
		System.out.println("Cube is="+b);
	}
}
class Super_const
{
	public static void main(String args[])
	{
		Cube ab=new Cube();
	}
}