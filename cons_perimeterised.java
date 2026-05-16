class Add
{
	int x; String y;
	Add(int a,String b)
	{
		System.out.println(a+" "+b);
	}
	Add(int a,int b)
	{
		System.out.println(a+" "+b);
	}
	/*void show()
	{
		System.out.println(x+" "+y);
	}*/
}
class Cons_perimeterised
{
	public static void main(String args[])
	{
		Add ob=new Add(10,"deep");
		Add oc=new Add(10,20);
		//ob.show();
	}
}