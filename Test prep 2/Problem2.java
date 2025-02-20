/*
 * Test prep 2; problem 2
 */
import java.util.*;
import java.lang.Math.*;
public class Problem2 
{

	public static void main(String[] args) 
	{
		double r, a, c;
	
		Scanner kb = new Scanner(System.in);
		
		r = rad();
		a= area(r);
		c = circumference(r);
		output(a,c); //saved as a variable when it only the method needed to operate
		//outputs that area and circumference are 0
	}
	
	//radius
	public static double rad()
	{
		//declarations
		double radius;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter a radius");
		radius = kb.nextDouble();
		
		return radius;
	}
	
	//area
	public static double area(double a)
	{
		//Declarations
		double area;
		
		area = Math.PI*(a*a); //couldn't remember how to use the math class
		
		return area;
	}
	//circumference
	public static double circumference(double c)
	{
		//Declarations
		double circumference;
		
		circumference = 2*Math.PI*c;
	
		return circumference;
	}
	//output
	public static void output(double a, double c)
	{
		//initialized variables
		System.out.println("The area is " + a);
		System.out.println("The circumference is " + c);
	}

}
