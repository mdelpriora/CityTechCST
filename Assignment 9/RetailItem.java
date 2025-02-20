/*
 * Assignment 9; problem 2
 */
public class RetailItem 
{
	/***Fields***/
	private String description;
	private int units;
	private double price;
	
	/***Constructors***/
	public RetailItem()
	{
		description = "";
		units = 0;
		price = 0;
	}
	public RetailItem(String d, int u, double p)
	{
		description = d;
		units = u;
		price = p;
	}
	
	/***Other methods***/
	//setters
	public void setDescription(String d)
	{
		description = d;
	}
	public void setUnits(int u)
	{
		units = u;
	}
	public void setPrice(double p)
	{
		price = p;
	}
	//getters
	public String getDescription()
	{
		return description;
	}
	public int getUnits()
	{
		return units;
	}
	public double getPrice()
	{
		return price;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
