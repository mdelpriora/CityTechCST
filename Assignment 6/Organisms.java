/*
 * Assignment 6; problem 6
 */
import java.util.*;
public class Organisms 
{

	public static void main(String[] args) 
	{
		//Declarations
		double start, population=0, increase;
		int days, count;
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter the starting population of organisms");
		start = kb.nextDouble();
		
		System.out.println("Enter the daily population increase percentage");
		increase = kb.nextDouble();
				
		System.out.println("Enter the number of days the organisms will multiply");
		days = kb.nextInt();
		
		//Processing
		for (count=0; count <= days; count++)
		{
			population = start + population*(increase/100);
			System.out.println("The population after " + count + " days is " + population);
		}
		
	}

}
