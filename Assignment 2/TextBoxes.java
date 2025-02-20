/*
 * Assignment 2; problem 2
 */

import javax.swing.JOptionPane;

public class TextBoxes 
{

	public static void main(String[] args) 
	{
		// Declaration
		String name, hours_str, payrate_str;
		double hours, payrate, grosspay;
		
		//Input
		name = JOptionPane.showInputDialog("Enter your name");
		
		hours_str = JOptionPane.showInputDialog("Enter hours");
		hours = Double.parseDouble(hours_str); //to convert string to double
		
		payrate_str = JOptionPane.showInputDialog("Enter payrate");
		payrate = Double.parseDouble(payrate_str); //to convert string to double
		
		//Processing
		grosspay = hours*payrate;
		
		//Output
		JOptionPane.showMessageDialog(null, "Hello " + name + "\n" + "Your grosspay is $" + grosspay);
		

	}

}
