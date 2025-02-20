/*
 * Assignment 5; problem 5
 */
import java.util.*;
public class Encrypt 
{

	public static void main(String[] args) 
	{
		//Declarations
		String word, cipher="";
		int length, character;
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter a word");
		word = kb.nextLine();
		
		//Processing
		length = word.length();
		
		for (int i=0; i<length; i++)
		{
			cipher = cipher + (char)(word.charAt(i)+3);
		}
		
		//Output
		System.out.println("Your new word is " + cipher);
	}

}
