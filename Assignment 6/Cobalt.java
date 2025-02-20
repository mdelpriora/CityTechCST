/*
 * Assignment 6; problem 3
 */
public class Cobalt
{

	public static void main(String[] args) 
	{
		//Declarations
		double cobalt=10;
		int counter;
		//Input
		
		//Processing/output
		
		for (counter=1; counter <= 5; counter++)
		{
			cobalt = cobalt-(cobalt*.12);
			System.out.println("There are " + cobalt + " grams of cobalt 60 after " + counter + " year/s");
		}
	
		

	}

}