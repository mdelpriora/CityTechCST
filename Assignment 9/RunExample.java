/*
 * Rectangle class demo
 */
import java.util.*;
public class RunExample 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		//create objects from class
		Example r1 = new Example();
		Example r2 = new Example(1,2);
		Example r3 = new Example (5);
		
		//change fields of given object
		System.out.println("Enter the length");
		double length=kb.nextDouble();
		
		System.out.println("Enter the width");
		double width=kb.nextDouble();
		
		r1.setLength(length);
		r1.setWidth(width);
		
		//display data/fields on an object
		
		System.out.println("The are of r1 is " + r1.getArea());
		System.out.println("The area of r2 is " + r2.getArea());
		System.out.println("The area of r3 is " + r3.getArea());
		
	}

}
