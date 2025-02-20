/*
 * Test 1; problem 12
 */
import java.util.Scanner;
public class Problem12 
{

	public static void main(String[] args) 
	{
		//Declarations
		String sentence, word1, word2;
		int length, space;
	
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter two words separated by a space");
		sentence = kb.nextLine();
		
		//Processing
		length = sentence.length();
		space = sentence.indexOf(" ");
		word1 = sentence.substring(0,space);
		word2 = sentence.substring(space+1,length);
	
		//Output
		System.out.println(word2 + " " + word1);

	}

}
