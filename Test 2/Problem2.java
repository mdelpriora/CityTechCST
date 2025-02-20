/*
 * Test 2; problem 2
 */
import java.util.*;
public class Problem2 
{

	public static void main(String[] args) 
	{
		double s1, s2, h;
		
		s1 = sides();
		s2 = sides();
		h = hypotenuse(s1,s2);
		output(h);
	}
	public static double sides()
	{
		double side;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter a side length for a triangle");
		side = kb.nextDouble();
		
		return side;
	}
	public static double hypotenuse(double s, double sd)
	{
		double hyp;
		
		hyp = Math.sqrt((s*s) + (sd*sd));
		
		return hyp;
	}
	public static void output(double h)
	{
		System.out.println("The hypotenuse length is " + h);
	}

}
