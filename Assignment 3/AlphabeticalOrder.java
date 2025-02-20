/*
 * Assignment 3; problem 2
 */
import java.util.Scanner;

public class AlphabeticalOrder 
{

	public static void main(String[] args) 
	{
		//Declarations
		String word1, word2, word3; //input
		String first = "", second = "", third = ""; //alphabetical order and output
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter first word");
		word1 = kb.nextLine();
		
		System.out.println("Enter second word");
		word2 = kb.nextLine();
		
		System.out.println("Enter third word");
		word3 = kb.nextLine();
		
		//Processing
		if (word1.compareTo(word2) < 0 && word1.compareTo(word3) < 0)
		{
			
			//word1 comes first
			first = word1;
			
			if (word2.compareTo(word3) < 0)
			{
				//word2 comes second
				second = word2;
				third = word3;
			}
			else
			{
				//word3 comes second
				second = word3;
				third = word2;
			}
		}
		
		if (word2.compareTo(word1) < 0 && word2.compareTo(word3) < 0)
		{
		
			//word2 comes first
			first = word2;
			
			if (word1.compareTo(word3) < 0)
			{
				//word1 comes second
				second = word1;
				third = word3;
			}
			else 
			{
				//word3 comes second
				second = word3;
				third = word1;
			}
		}
		
		if (word3.compareTo(word1) < 0 && word3.compareTo(word2) < 0)
		{
		
			//word3 comes first
			first = word3;
			
			if (word1.compareTo(word2) < 0)
			{
				//word1 comes second
				second = word1;
				third = word2;
			}
			else 
			{
				//word2 comes second
				second = word2;
				third = word1;
			}
		}
		
		//Output
		System.out.println("The words entered in alphabetical order are:");
		System.out.println(first);
		System.out.println(second);
		System.out.println(third);
	}

}
