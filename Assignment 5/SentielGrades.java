/*
 * Assignment 5; problem 4
 */
import java.util.Scanner;
public class SentielGrades 
{

	public static void main(String[] args) 
	{
		//Declarations
		double grade, total, avrg;
		int counter;
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter the first grade");
		grade = kb.nextDouble();
		
		//Processing
		total = 0;
		counter = 0;
		avrg = 0;
		while (grade!=-1 && grade>=0 && grade<=100)
		{
			
			counter++;
			total = total + grade;
			System.out.println("Enter another grade or -1 to end");
			grade = kb.nextDouble();
		}
		if (counter == 0)
		{
			System.out.println("No data was entered)");
		}
		else
		{
			avrg = ((double)total)/(counter);
			System.out.println("The class average is " + avrg);
		}
	
		
		
		//Output
		

	}

}
