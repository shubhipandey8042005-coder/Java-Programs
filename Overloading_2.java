public class Overloading_2
{
	int add()
	{
		int a=10,b=20,c;
		c=a+b;
		return c;
	}

	void add(int x,int y,int z)
	{
		int c;
		c=x+y+z;
		System.out.println(c);
	}
	public static void main(String args[])
	{
		Overloading_2 ob=new Overloading_2();
		int ad=ob.add();
		System.out.println(ad);
		//int ad=ob.add(200,200,300);
	}
}