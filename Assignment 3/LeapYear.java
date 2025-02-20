/*
 * Assignment 3; problem 5
 */

import java.util.Scanner;

public class LeapYear 
{

	public static void main(String[] args) 
	{
		//Declarations
		int year;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter a year after 1582");
		year = kb.nextInt();
		
		//Processing
		if (year%100 == 0 && year%400 != 0)
		{
			 System.out.println(year + " is not a leap year");
		}
		else
		{
			if (year%4 == 0)
			{
				System.out.println(year + " is a leap year");
			}
			else
			{
				System.out.println(year + " is not a leap year");
			}
		}
		
			
		
		//Output

	}

}
