/*
 * Assignment 4; problem 2
 */

import java.util.Scanner;

public class SpeedOfSound 
{

	public static void main(String[] args) 
	{
		//Declarations
		String medium;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter either air, water or steel to find out how fast sound travels");
		medium = kb.nextLine();
		
		//Processing/output
		switch (medium)
		{
		case "air":
			System.out.println("The speed of sound when traveling through air is 1100 ft/sec.");
			break;
		case "water":
			System.out.println("The speed of sound when traveing in water is 4900 ft/sec");
			break;
		case "steel":
			System.out.println("The speed of sound when traveing through steel is 16,400 ft/sec");
			break;
		default:
			System.out.println(medium + " is not in the the system");
		}
		
	}

}
