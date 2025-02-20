/*
 * Assignment 4; problem 6
 */
import java.util.Scanner;

public class NumberOfChecks 
{

	public static void main(String[] args) 
	{
		//Declarations
		double checks, fees=0, total;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter the number of checks you have used for the month");
		checks = kb.nextInt();
		
		//Processing
		if (checks <= 20)
		{
			fees = .10*checks;
		}
		if (checks <= 39 && checks > 20)
		{
			fees = .08*checks;
		}
		if (checks <= 59 && checks > 39)
		{
			fees = .06* checks;
		}
		if (checks >= 60)
		{
			fees = .04*checks;
		}
		
		total = 10+fees;
		
		//Output
		System.out.println("Your bank service fees for the month comes to $" + total);
	}

}
