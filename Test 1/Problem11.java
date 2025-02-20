/*
 * Test 1; problem 11
 */
import javax.swing.JOptionPane;
public class Problem11 
{

	public static void main(String[] args) 
	{
		//Declarations
		String incomeString;
		double income;
		
		//Input
		incomeString = JOptionPane.showInputDialog("Enter your income");
		income = Double.parseDouble(incomeString);
	
		//Processing/Output
		if (income>30000)
		{
			JOptionPane.showMessageDialog(null, "The bank will give you a loan");
		}
		else
		{
			JOptionPane.showMessageDialog(null, "The bank will not give you a loan");
		}
		
	}

}
