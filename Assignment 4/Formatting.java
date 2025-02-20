/*
 * Assignment 4; problem 3
 */
import java.text.DecimalFormat;

public class Formatting 
{

	public static void main(String[] args) 
	{
		//Declarations
		double number = 123456789.1234567890;
		
		
		//Original
		System.out.println("The original number is: ");
		System.out.println(number + "\n");
		
		//Format with decimal

		DecimalFormat f1 = new DecimalFormat("#0.0");	
		DecimalFormat f2 = new DecimalFormat("#,##0.00");	
		DecimalFormat f3 = new DecimalFormat("#,##0.000");
		
		//Output
		System.out.println("Formatting with DecimalFormat objects");
		
		System.out.println(f1.format(number));
		System.out.println(f2.format(number));
		System.out.println(f3.format(number));
		
		//Using printf
		
		System.out.println("Formatting with printf");
		System.out.printf("%.1f\n", number);
		System.out.printf("%,.2f\n", number);
		System.out.printf("%,.3f\n", number);

	}
}
		