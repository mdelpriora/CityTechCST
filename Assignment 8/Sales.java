/*
 * Assignment 8; problem 1
 */
import java.util.*;
public class Sales 
{

	public static void main(String[] args) 
	{
		int numdays=7;
		double totalSales=0, avrg=0;
		
		totalSales = total(numdays);
		avrg = average(totalSales,numdays);
		results(numdays, totalSales, avrg);

	}
		public static double total(int days)
		{
			//declarations
			double total=0, sales;
		
			Scanner kb = new Scanner(System.in);
			
			//input/processing
			for (int i=0; i<days; i++)
			{
				System.out.println("Enter number of sales");
				sales = kb.nextDouble();
				total = total +sales;
			}
				return total;
		
		}
	
		public static double average(double s, int d)
		{
			//declarations
			double average;
			
			//input/processing
			average = s/d;
			return average;
		}
		
		public static void results(int d, double s, double av)
		{
			System.out.println("The number of days is " + d);
			System.out.println("The total is " + s + " sales");
			System.out.println("The average is " + av + " sales per week");
		}

}
