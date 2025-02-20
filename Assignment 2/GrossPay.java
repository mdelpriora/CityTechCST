
//Assignment 1, problem 1

import java.util.Scanner;

public class GrossPay 
{

	public static void main(String[] args) 
	{
		// Declaration
		String name;
		double hours, payrate, grosspay;
	
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.print("Enter your name");
		name = kb.nextLine();
		
		System.out.print("Enter number of hours worked");
		hours = kb.nextDouble();
		
		System.out.print("Enter your payrate");
		payrate = kb.nextDouble();
		
		//Processing
		grosspay = hours*payrate;
		
		//Output
		System.out.println("Hello" + name);
		System.out.println("Your grosspay is" + grosspay);
	}

}
