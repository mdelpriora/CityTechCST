/*
 * Assignment 8; problem 4
 */
import java.util.*;
public class PrimeNumbers 
{

	public static void main(String[] args) 
	{
		//declarations
		int number;
		Scanner kb = new Scanner(System.in);
		//input
		System.out.println("Enter how many prime numbers you want to see");
		number = kb.nextInt();
		//processing/output
		System.out.println("Prime numbers below " + number);
		for (int count=1; count<number; count++)
		{
			if (isPrime(count)==true)
			{
				System.out.println(count + " is prime");
			}
		}
		
	}
	public static boolean isPrime(int number)
	{
		//Declarations
		boolean prime=true;
		//processing
		for (int i=2; i<number; i++)
		{
			if (number%i ==0)
			{
				//number isn't prime
				prime = false;
			}
		}
		return prime;
	}

}
