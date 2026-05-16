class A
{
	A()
	{
		float r,area;
		r=2;
		area=3.14f*r*r;
		System.out.println("Area of circle is"+area);
	}
	{
		int area,l,b;
		l=5;
		b=2;
		area=l*b;
		System.out.println("Area of rectangle is"+area);
	}
	
}
class B extends A
{
	B()
	{
		float b=6,h=3,area; 
		area=0.5f*b*h;
		System.out.println("Area of triangle is"+area);
	}
}
class C extends B
{
	C()
	{
		int s=4,area;
		area=s*s;
		System.out.println("Area of square is"+area);
	}
}
class Inh_mul_calc
{
	public static void main(String args[])
	{
		C obj=new C();
	}
}