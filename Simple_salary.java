class Simple_salary
{
	public static void main(String args[])
	{
		double basic,DA,HRA,total;
		basic=30000;
		HRA=2000;
		DA=basic*20/100;
		total=basic+DA+HRA;
		System.out.println("total is :"+total);
	}
}