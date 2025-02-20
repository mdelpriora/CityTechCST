/*
 * Assignment 5; problem 1
 */

import java.util.Scanner;

public class President 
{

	public static void main(String[] args) 
	{
		//Declarations
		int age;
		String citizen="";
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter your age");
		age = kb.nextInt();
	
	
		//Processing/output
		
		if (age < 35)
		{
			System.out.println("You can't become the president of the United States");
		}
		else
		
			System.out.println("Were you born in the United States and a citizen?");
			kb.nextLine();
			citizen = kb.nextLine();
		
			if (citizen.equals("yes"))
			{
				System.out.println("You can be president of the United States");
			}
			else
			{
				System.out.println("You can't become the president of the United States");
			}
			
	}

}
