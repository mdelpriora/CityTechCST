/*
 * Test prep 1; problem 1
 */
import javax.swing.JOptionPane;

public class Problem1 
{

	public static void main(String[] args) 
	{
		//Declarations
		String numberstr="";
		int number;
		
		//Input
		//Had trouble remembering how to store number 
		numberstr = JOptionPane.showInputDialog("Enter a number");
		number = Integer.parseInt(numberstr);
		
		//Processing/output
		
		if (number%2 == 0)
		{
			 JOptionPane.showMessageDialog(null, "This number is even");
		}
		else //forgot null
		{
			JOptionPane.showMessageDialog(null, "This number is odd");
		}
		

	}

}
