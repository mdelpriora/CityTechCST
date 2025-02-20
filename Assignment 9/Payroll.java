/*
 * Assignment 9; problem 3
 */
public class Payroll 
{
	/***Fields***/
	private String name;
	private String id;
	private double payrate;
	private double hours;
	
	/***Constructors***/
	public Payroll()
	{
		name = "";
		id = "";
		payrate = 0;
		hours = 0;
	}
	public Payroll(String n, String i, double p, double h)
	{
		name = n;
		id = i;
		payrate = p;
		hours = h;
	}

	/***Other methods***/
	//setters
	public void setName(String n)
	{
		name = n;
	}
	public void setId(String i)
	{
		id = i;
	}
	public void setPayrate(double p)
	{
		payrate = p;
	}
	public void setHours(double h)
	{
		hours = h;
	}
	//getters
	public String getName()
	{
		return name;
	}
	public String getId()
	{
		return id;
	}
	public double getPayrate()
	{
		return payrate;
	}
	public double getHours()
	{
		return hours;
	}
	public double getPayroll()
	{
		return hours*payrate;
	}
	
}
