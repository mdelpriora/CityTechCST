/*
 * Assignment 3; problem 6
 */

import java.util.Scanner;

public class Dictionary 
{

	public static void main(String[] args) 
	{
		//Declarations
		String word;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter a word");
		word = kb.nextLine();
		
		//Processing/output
		word = word.toLowerCase();
		
		switch(word)
		{
		case "software":
			System.out.println("Software is a collection of data or computer instructions that tell the computer how to work");
			break;
		case "hardware":
			System.out.println("Hardware is the physical parts or components of a computer");
			break;
		case "binary":
			System.out.println("Binary means something referring or involving two components");
			break;
		default:
			System.out.println(word + " is not in the dictionary");
		
		}
	

	}

}
