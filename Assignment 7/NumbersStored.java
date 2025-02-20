/*
 * Assignment 7; problem 1
 */
import java.util.Scanner;
public final class NumbersStored 
{

	public static void main(String[] args) 
	{
		//Declarations
		double [] numbers;
		double total=0, avrg, max, min;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("How many numbers will you be entering?");
		numbers = new double[kb.nextInt()];
		
		//Processing
		for (int i=0; i < numbers.length; i++)
		{
			System.out.println("Enter a number");
			numbers[i] = kb.nextDouble();
		}
			//calculating avrg
		for (int i=0; i < numbers.length; i++)
		{
			total = total + numbers[i];
		}
		avrg = total/numbers.length;
		
			//calculating min
		min = numbers[0];
		for (int i=0; i < numbers.length; i++)
		{
			if (numbers[i] < min)
			{
				min = numbers[i];
			}
			else
			{
				min = numbers[0];
			}
		}
			//calculating max
		max = numbers[0];
		for (int i=0; i < numbers.length; i++)
		{
			if (numbers[i] > max)
			{
				max = numbers[i];
			}
			else
			{
				min = numbers[0];
			}
		}
		//Output
		System.out.println("The total is " + total);
		System.out.println("The average is " + avrg);
		System.out.println("The largest number is " + max);
		System.out.println("The smallest number is " + min);
	}

}
