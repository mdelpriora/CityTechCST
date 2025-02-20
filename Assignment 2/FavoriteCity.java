/*
 * Assignment 2; problem 3
 */

import java.util.Scanner;

public class FavoriteCity 
{

	public static void main(String[] args) 
	{
		// Declarations
		String city, uppercase, lowercase;
		char first, last;
		int characters;
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Your favorite city:");
		city = kb.nextLine();
		
		//Processing
		characters = city.length();
		uppercase = city.toUpperCase();
		lowercase = city.toLowerCase();
		first = city.charAt(0);
		last = city.charAt(characters-1);
		
		//Output
		System.out.println("Your favorite city is "+ city);
		System.out.println("This city has "+ characters + " letters");
		System.out.println("The uppercase spelling is " + uppercase);
		System.out.println("The lowercase spelling is " + lowercase);
		System.out.println("The first character is " + first);
		System.out.println("The last character is " + last);
		
	}

}
