/*
 * Assignment 5; problem 3
 */
import java.util.Scanner;

public class Grades 
{

	public static void main(String[] args) 
	{
		//Declarations
		double grade, total, avrg;
		int numGrades;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("How many grades will you be entering?");
		numGrades = kb.nextInt();
		
		//Processing
		total = 0;
		avrg = 0;
		for (int counter = 1; counter <= numGrades; counter++)
		{
			System.out.println("Enter a grade");
			grade = kb.nextDouble();
			
			total = total + grade;
		}
		
		avrg = total/numGrades;
		
		//Output
		System.out.println("The grade average for the class is " + avrg);

	}

}
