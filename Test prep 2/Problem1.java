/*
 * Test prep 2; problem 1
 */
import java.util.*;
public class Problem1 
{

	public static void main(String[] args) 
	{
		//Declarations
		int [] numbers;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("How many numbers of the Fibonacci sequence do you want to see?");
		numbers = new int [kb.nextInt()];
		
		numbers[0]=0;
		numbers[1]=1;
		//Processing
		for (int count=2; count < numbers.length; count++)
		{
			numbers[count]=numbers[count-1]+numbers[count-2];//wasn' sure how to input an equation that show this
		}
		
		for (int count=0; count< numbers.length; count++)
		{
			System.out.println("The numbers are " + numbers[count]);
		}
		
	}


}
