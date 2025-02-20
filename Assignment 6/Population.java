/*
 * Assignment 6; Problem 2
 */
public class Population 
{

	public static void main(String[] args) 
	{
		//Declarations/input
		int people=8175133, goalp=10000, year=2010, counter=0;
	
		//processing/output
		while (people>=goalp)
		{
			people = people/2;
			year = year-40;
			System.out.println("There were "+ people + " people in " + year);
			counter++;
		}
		System.out.println("The population of NYC was about 10000 people in " + year);
		
	}

}
