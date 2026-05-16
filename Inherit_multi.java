class Multi_inherit
{
	void msg()
	{
		System.out.println("parent class");
	}
	
}
class In extends Multi_inherit
{
	void display()
	{
		System.out.println("child class");
	}
}
class Multi_inh extends In
{
	void show()
	{
		System.out.println("sub class");
	}
}
class Inherit_multi
{
	public static void main(String args[])
	{
	        Multi_inh ab=new Multi_inh();
		ab.display();
		ab.msg();
		ab.show();
	}
		
	
}