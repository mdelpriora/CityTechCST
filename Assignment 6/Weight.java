/*
 * Assignment 6; problem 4
 */
import java.util.*;
public class Weight 
{

	public static void main(String[] args) 
	{
		//Declarations
		String gender;
		double height, weight, ideal;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter whether you are male or female");
		gender = kb.nextLine();
		
		System.out.println("Enter your height (in inches)");
		height = kb.nextDouble();
		
		System.out.println("Enter your weight");
		weight = kb.nextDouble();
		//Processing/output
		if (gender.equalsIgnoreCase("male"))
		{
			ideal = height*4-128;
			if (weight<ideal)
			{
				System.out.println("You are underweight");
			}
			if (weight>ideal)
			{
				System.out.println("You are over weight");
			}
			if (weight==ideal)
			{
				System.out.println("You are the ideal weight");
			}
		}
		if (gender.equalsIgnoreCase("female"))
		{
			ideal = height*3.5-108;
			if (weight<ideal)
			{
				System.out.println("You are underweight");
			}
			if (weight>ideal)
			{
				System.out.println("You are over weight");
			}
			if (weight==ideal)
			{
				System.out.println("You are the ideal weight");
			}
		}

	}

}
