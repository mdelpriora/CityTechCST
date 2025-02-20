/*
 * Assignment 7; problem 2
 */
import java.util.*;
public class FamilyFriends 
{

	public static void main(String[] args) 
	{
		//Declarations
		String []names;
		String upper="", lower="";
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("How many names do you want to enter?");
		names = new String [kb.nextInt()];
		
		kb.nextLine();
		
		//Processing
		int count;
		
		for (count=0; count<names.length; count++)
		{
			System.out.println("Enter a name");
			names [count]= kb.nextLine();
			upper = names[count].toUpperCase();
			lower = names[count].toLowerCase();	
			
			System.out.println("The name in uppercase: " + upper);
			System.out.println("The name in lowercase: " + lower);
		}
			
		
		
		
	
	
	}

}
