/*
 * Final; problem 1;
 */
import java.util.*;
public class Problem1 
{

	public static void main(String[] args) 
	{
		//Declarations
		double area=0, length, width;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter the length of the room (in feet)");
		length = kb.nextDouble();
		
		System.out.println("Enter the width of the room (in feet)");
		width = kb.nextDouble();
		
		area = length*width;
		
		//Processing/output
		
		if (area < 80 || (width < 6 || length < 6))
		{	
			System.out.println("The room is not a legal NYC bedroom");
			
		}
		else
		{
			System.out.println("The room is a legal NYC bedroom");
		}
		if(width < 6)
		{
			System.out.println("The width is too small");
		}
		if(length < 6)
		{
			System.out.println("The length is too small");
		}
		if(area < 80)
		{
			System.out.println("The area is too small");
		}

	}

}
