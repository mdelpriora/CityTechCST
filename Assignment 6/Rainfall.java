/*
 * Assignment 6; problem 5
 */
import java.util.*;
public class Rainfall 
{

	public static void main(String[] args) 
	{
		//Declarations
		double avrg=0, rainfall=0, total=0;
		int  month, year, years, months=12;
		
		Scanner kb = new Scanner(System.in);
		
		//input
		do 
		{
			System.out.println("Enter how many years of rainfall do you want to calculate?");
			years = kb.nextInt();
		}while (years <= 0);//input validation
	
		//Processing
		for (year = 1; year <= years ; year++)
		{
			for (month = 1; month <= months; month++)
			{
				do
				{
					System.out.println("Enter the amount of rainfall for month " + month + " (in inches)");
					rainfall = kb.nextDouble();
					
				}while (rainfall<0);//input validation
			
			total = total + rainfall;
			}
			
		}
		avrg = total/(years*months);
		
		//output
		System.out.println("The rainfall was collected over " + months + " months");
		System.out.println("The total rainfall was " + total + " inches");
		System.out.println("The average rainfall per month is " + avrg + " inches");
		
	}

}
