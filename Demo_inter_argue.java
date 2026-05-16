class Theory
{
	int a,b;
	void getMarks(int x,int y)
	{
		a=x;b=y;
	}
	void showMarks()
	{
		System.out.println("hindi="+a);
		System.out.println("eng="+b);
	}
}
interface Practical
{
	int p=80;
	void showPracticalMarks();
}
class Marks extends Theory implements Practical
{
	void showPracticalMarks();
	{
		System.out.println("Practical"+b);
	}
	void showTotalAndPercentage()
	{
		System.out.println("Total="+(h+e+p));
		System.out.println("Per="+((h+e+p)/300.0f*100));
	}
}
class Demo_inter_argue
{
	public static void main(String args[])
	{
		Marks m=new Marks();
		m.getMarks(70,75);
		m.showMarks();
		m.showPracticalMarks();
		m.showPracticalAndPercentage();
	}
}
	
