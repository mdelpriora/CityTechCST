/*
 * Final; problem 2
 */
import java.util.*;
public class Problem2 
{

	public static void main(String[] args) 
	{
		//Declarations
		String pass;
		int length;
		
		Scanner kb = new Scanner(System.in);
		//Input/processing/output
		do
		{
				System.out.println("Enter a password that is exactly 7 characters long");
				pass = kb.nextLine();
				length = pass.length();
				if(length < 7)
				{
					System.out.println("Password is too short, it must be 7 characters long");
				}
				if(length > 7)
				{
					System.out.println("Password is too long, it must be 7 characters long");
				}
		}while (length < 7 || length > 7);
		
		if (length == 7)
		{
				System.out.println("Your password is " + pass);
		}

	}

}
