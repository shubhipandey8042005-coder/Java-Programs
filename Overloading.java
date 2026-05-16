public class Overloading
{
	void add()
	{
		int a=10,b=20,c;
		c=a+b;
		System.out.println(c);
	}

	void add(int x,int y,int z)
	{
		int c;
		c=x+y+z;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Overloading ob=new Overloading();
		ob.add();
		ob.add(200,200,300);
	}
}