/*
 * Assignment 3; problem 4
 */
import java.util.Scanner;
public class Taxes {

	public static void main(String[] args) {
		// Declarations
		double income, tax, total;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter your yearly income");
		income = kb.nextDouble();
		
		
		//Processing
				
		if (income < 20000)
		{
			//2% tax
			tax = .02;
		}
		else
		{
			//Tax is not 2%
			if (income >= 20000 && income < 50000)
			{
				//3% tax
				tax = .03;
			}
			else
			{
				//Tax is not 3%
				tax = .05;
			}
		}
		
		total = income*tax;
		
		//Output
		System.out.println("Your yearly income is $" + income);
		System.out.println("Your total taxes due is $"+ total);
		
		

	}

}
