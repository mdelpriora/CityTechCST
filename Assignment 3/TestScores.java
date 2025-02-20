/*
 * Assignment 3; problem 3
 */
import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		//Declarations
		String a_str, b_str, c_str, grade;
	
		double a, b, c, avrg;

		//Input
		a_str = JOptionPane.showInputDialog("Enter the first test score");
		a= Double.parseDouble(a_str); //convert string to double
		
		b_str = JOptionPane.showInputDialog("Enter the second test score");
		b = Double.parseDouble(b_str); //convert string to double
		
		c_str = JOptionPane.showInputDialog("Enter the third test score");
		c = Double.parseDouble(c_str); //convert string to double
		
		//Processing
		avrg = (a + b + c)/3;
		
		
		if (avrg <= 60)
		{
			//get an F
			grade = "F";
		}
		else
		{
			//grade is not an F
			if (avrg <= 69 && avrg > 60)
			{
				//get a D
				grade = "D";
			}
			else 
			{
				//grade is not a D
				if (avrg <= 79 && avrg >69)
				{
					//get a C
					grade = "C";
				}
				else
				{
					//grade is not a C
					if (avrg <= 89 && avrg > 79)
					{
						//get a B
						grade = "B";
					}
					else
					{
						//get an A
						grade = "A";
					}
				}
			}
		}
		
		//Output
		JOptionPane.showMessageDialog(null, "Your numerical average is " + avrg);
		JOptionPane.showMessageDialog(null, "Your letter grade is " + grade);

	}

}
