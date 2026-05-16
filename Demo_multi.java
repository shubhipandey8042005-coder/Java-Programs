interface A
{
	void show();
}
interface B
{
	void disp();
}
class Multi implements A,B
{
	public void show()
	{
		System.out.println("A");
	}
	public void disp()
	{
		System.out.println("B");
	}
}
class D extends Multi
{

}
class Demo_multi
{
	public static void main(String args[])
	{
		D ob=new D();
		
		ob.show();
		ob.disp();
	}
}