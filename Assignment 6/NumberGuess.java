/*
 * Assignment 6; problem 1
 */
import java.util.*;
public class NumberGuess
{
	public static void main(String[] args) 
	{
		//Declarations
		int number, guess=-1;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("The compueter has randomly generated a number from 1 to 100");
		
		number = (int) (100*Math.random());
		//System.out.println(number);
		
		//processing/output
		while (guess != number)
		{
			System.out.println("Enter a numerical guess");
			guess = kb.nextInt();
			
			if (guess < number)
			{
				System.out.println("Numer is too low");
			}
			if (guess > number)
			{ 
				System.out.println("Number is too high");
			}
		}
		System.out.println("Congratulations you guessed the correct number:" + number);
		
	}
}
