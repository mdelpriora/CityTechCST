/*
 * Test 1; problem 10
 */
import java.util.Scanner;

public class Problem10 
{

	public static void main(String[] args) 
	{
		//Declarations
		int street;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a street number");
		street = kb.nextInt();
		
		//Processing/output
		if (street%2==0)
		{
			System.out.println("This street runs eastbound");
		}
		else
		{
			System.out.println("This street runs westbound");
		}

	}

}
