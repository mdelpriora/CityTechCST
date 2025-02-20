/*
 * Assignment 3; problem 1
 */
import java.util.Scanner;
public class SmallestNumber {

	public static void main(String[] args) {
		// Declarations
		double a, b, c, smallest;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a number");
		a = kb.nextDouble();
		
		System.out.println("Enter a second number");
		b = kb.nextDouble();
		
		System.out.println("Enter a third number");
		c = kb.nextDouble();
		
		//Processing
		if (a < b && a < c)
		{
			//Then a is the smallest
			smallest = a;
		}
		else 
		{
			//a is not the smallest
			if (b < c)
			{
				//b is the smallest
				smallest = b;
			}
			else
			{
				//c is the smallest
				smallest = c;
			}
		}
		
		//Output
		System.out.println("The smallest number is " + smallest);

	}

}
