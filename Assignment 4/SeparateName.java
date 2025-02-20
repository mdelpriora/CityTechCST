/*
 * Assignment 4; problem 1
 */

import java.util.Scanner;

public class SeparateName 
{

	public static void main(String[] args) 
	{
		//Declarations
		String name, first, last;
		int spaceIndex, length;
	
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter your first and last name separated by a space");
		name = kb.nextLine();
		
		//Processing
		spaceIndex = name.indexOf(" ");
		length = name.length();
		
		if (spaceIndex != -1)
		{
			//there is a space
			first = name.substring(0,spaceIndex);
			last = name.substring(spaceIndex+1,name.length());
		
			System.out.println("Your first name is " + first);
			System.out.println("Your last name is " + last);
		}
		else 
		{
			//there is no space
			System.out.println("ERROR: There is no space found");
		}
		
		
	}

}
