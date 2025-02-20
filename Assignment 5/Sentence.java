/*
 * Assignment 5; problem 2
 */
import java.util.Scanner;
public class Sentence 
{

	public static void main(String[] args) 
	{
		//Declarations
		String sentence, word1, word2;
		int n1, n2, length;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Enter a sentence");
		sentence = kb.nextLine();
		
		System.out.println("Enter a word in the sentence");
		word1 = kb.nextLine();
		
		System.out.println("Enter a second word to replace the previous word with");
		word2 = kb.nextLine();
		//Processing
		length = sentence.length();
		n1 = sentence.indexOf(word1);
		n2 = n1 + word1.length();
		
		
		//Output
		System.out.println(sentence.substring(0,n1) + word2 + sentence.substring(n2,length)); 

	}

}
