final class Fin
{
	final int a=10;
	final void show()
	{
		//a=20;
		System.out.println(a);
	}
}
class F extends Fin
{
}
class Final_demo
{
	public static void main(String args[])
	{
		Fin ab=new Fin();
		ab.show();
	}
}