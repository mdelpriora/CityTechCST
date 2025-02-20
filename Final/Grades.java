/*
 * Final problem 3
 */
public class Grades 
{
	/***Fields***/
	private String name;
	private double test1;
	private double test2;
	private double test3;
	
	/***Constructors***/
	public Grades()
	{
		name = "";
		test1 = 0;
		test2 = 0;
		test3 = 0;
	}
	public Grades(String n, double a, double b, double c)
	{
		name = n;
		test1 = a;
		test2 = b;
		test3 = c;
	}
	
	/***Other Methods***/
	//Setters
	public void setName(String n)
	{
		name = n;
	}
	public void setTest1(double a)
	{
		test1 = a;
	}
	public void setTest2(double b)
	{
		test2 = b;
	}
	public void setTest3(double c)
	{
		test3 = c;
	}
	
	//Getters
	public String getName()
	{
		return name;
	}
	public double getTest1()
	{
		return test1;
	}
	public double getTest2()
	{
		return test2;
	}
	public double getTest3()
	{
		return test3;
	}
	public double getAvrg()
	{
		return (test1 + test2 + test3)/3;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
