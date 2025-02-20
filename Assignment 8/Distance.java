/*
 * Assignment 8; problem 3
 */
import java.util.*;
public class Distance 
{

	public static void main(String[] args) 
	{
		double m, k, i, f;
		
		m = meters();
		k = kilometers(m);
		i = inches(m);
		f = feet(m);
		
	}
	//meters
	public static double meters()
	{
		double distance;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a distance in meters");
		distance = kb.nextDouble();
		
		return distance;
	}
	//kilometers
	public static double kilometers(double m)
	{
		double km;
		
		km = m*.001;
		System.out.println(m + " meters is equal to " + km + " kilometers");
		
		return km;
	}
	public static double inches(double m)
	{
		double in;
		
		in = m*39.37;
		
		System.out.println(m + " meters is equal to " + in + " inches");
		
		return in;
	}
	//feet
	public static double feet(double m)
	{
		double ft;
		
		ft = m*3.281;
		
		System.out.println(m + " meters is equal to " + ft + " feet");
		
		return ft;
	}

}
