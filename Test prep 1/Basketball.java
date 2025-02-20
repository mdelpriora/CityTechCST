/*
 * Test prep 1; problem 2
 */
import java.util.Scanner;

public class Basketball 
{

	public static void main(String[] args) 
	{
		//Declarations
		int nets, lakers;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter the number of points the Nets made");
		nets = kb.nextInt();
		
		System.out.println("Enter the number of points the Lakers made");
		lakers = kb.nextInt();
		
		//Processing/output
		if (nets < lakers)
		{
			//lakers win
			System.out.println("The Lakers won");
		}
		else
		{
			if (lakers < nets)
			{
				//nets win
				System.out.println("The Nets won");
			}
			
			else
			{
				//tie
				System.out.println("There was a tie");
			}
		}
			
			

	}

}
