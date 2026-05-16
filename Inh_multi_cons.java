class A
{
	A()
	{
		System.out.println("inside super/parent class");
	}
}
class B extends A
{
	B()
	{
	System.out.println("outside child class");
	}
}
class C extends B
{
	C()
	{
	System.out.println("Inside sub class");
	}
}
class Inh_multi_cons
{
	public static void main(String args[])
	{
		C obj=new C();
	}
}