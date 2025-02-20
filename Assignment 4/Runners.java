/*
 * Assignment 4; problem 4
 */

import java.util.Scanner;
public class Runners {

	public static void main(String[] args) {
		//Declarations
		String name1, name2, name3, first="", second="", third="";
		double time1, time2, time3;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter first runner's name");
		name1 = kb.nextLine();
		System.out.println("Enter second runner's name");
		name2 = kb.nextLine();
		System.out.println("Enter third runner's name");
		name3 = kb.nextLine();
		
		System.out.println("Enter first runner's time");
		time1 = kb.nextDouble();
		System.out.println("Enter second runner's time");
		time2 = kb.nextDouble();
		System.out.println("Enter third runner's time");
		time3 = kb.nextDouble();
		
		//Processing
		if (time1 < time2 && time1 < time3)
		{
			//first is name1
			first = name1;
		
			if (time2 < time3)
			{
				//name2 is second
				second = name2;
				third = name3;
			}
			else
			{
				//name3 is second
				second = name3;
				third = name2;
			}
		}
		if (time2 < time1 && time2 < time3)
		{
			//first is name2
			first = name2;
		
			if (time1 < time3)
			{
				//name1 is second
				second = name1;
				third = name3;
			}
			else
			{
				//name2 is second
				second = name3;
				third = name1;
			}
		}
		if (time3 < time1 && time3 < time2)
		{
			//first is name3
			first = name3;
		
			if (time1 < time2)
			{
				//name1 is second
				second = name1;
				third = name2;
			}
			else
			{
				//name2 is second
				second = name2;
				third = name1;
			}
		}
		//Output
		System.out.println("The runners won in the following order:");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);

	}

}
