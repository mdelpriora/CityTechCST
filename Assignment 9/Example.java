/*
 * Rectangle class example
 */
public class Example 
{
	/***fields or data properties***/
	
	private double length;
	private double width;
	
	/***Constructors***/
	
	public Example() //constructor method doesn't need a return value
	{
		length = 0;
		width = 0;
	}
	
	public Example(double l, double w)
	{
		length = l;
		width = w;
	}
	public Example(double n)
	{
		length = n;
		width = n;
	}
	
	/***Other methods***/
	
	//setters or mutators (void and have arguments)
	public void setLength(double l) //relates to instances not class, no static
	{
		length = l;
	}
	
	public void setWidth(double w)
	{
		width = w;
	}
	
	//Getters or accessors (return a value and don't take arguments
	public double getLength() //no static
	{
		return length;
	}
	
	public double getWidth()
	{
		return width;
	}
	
	public double getArea()
	{
		return length*width;
	}
	
	public double getPerimeter()
	{
		return (2*length)+(2*width);
	}
}
