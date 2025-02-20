/*
 * Test 2; problem 3
 */
import java.util.*;
public class Problem3 
{

	public static void main(String[] args) 
	{
		//Declarations/input
		double temp[];
		int days=7, count;
		double total=0, avrg, max, min;
		
		Scanner kb = new Scanner(System.in);
		
		//Processing
		temp= new double[days+1];
		
		for (count=0; count<days; count++)
		{
			System.out.println("Enter a temperature");
			temp[count]= kb.nextDouble();
		}
		
		//total
		for (count=0; count<days; count ++)
		{
			total = total + temp[count];
		}	
		avrg = total/days;
		
		//minimum
		min = temp[0];
		
		for (count=0; count<days; count++)
		{
			if (temp[count]<min)
			{
				min=temp[count];
			}
			else
			{
				min=temp[0];
			}
		}
		
		//maximum
		max = temp[days];
		
		for (count=0; count<days; count++)
		{
			if (temp[count]>max)
			{
				max=temp[count];
			}
			else
			{
				max=temp[count];
			}
		}
		
		System.out.println("The total temperature for this week was " + total + "degrees");
		System.out.println("The average temperature for this week was " + avrg + "degrees");
		System.out.println("The minimum temperature for this week was " + min + "degrees");
		System.out.println("The maximum temperature for this week was " + max + "degrees");
		

	}

}
