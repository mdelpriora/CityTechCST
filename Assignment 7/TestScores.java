/*
 * Assignment 7; problem 3
 */
import java.util.*;
public class TestScores 
{

	public static void main(String[] args) 
	{
		//Declarations
		double [][] scores = new double [5][3];
		double total=0, avrg=0, avrgAll, totalAll;
		
		Scanner kb = new Scanner(System.in);
		//Input
		for (int row=0; row<5;row++)//outer loop
		{
			System.out.println("Enter scores for student " + row);
			
			for (int col=0; col<3; col++)//inner loop
			{
				scores[row][col] = kb.nextDouble();
			}
		}
		
		//Processing
	
		//avrg for each student
		for (int row=0; row<5; row++)
		{
			//processing a student
			total=0;
			for (int col=0; col<3; col++)
			{
				total = total + scores[row][col];
			}
			avrg = total/3;
			System.out.println("The average score for student " + row + " is " + avrg);
		}
		//avrg of all students
		totalAll=0;
		int row=0;
		int col=0;
		for (row=0; row<5; row++)
		{
			//processing a student
			total=0;
			for (col=0; col<3; col++)
			{
				total = total + scores[row][col];
			}
			totalAll= totalAll + total;
		}
		avrg = totalAll/(row);
		System.out.println("The average score for all students is " + avrg);
	}

}
