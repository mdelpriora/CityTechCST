/*
 * Running TestScores
 */
import java.util.*;
public class RunTestScores 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		//Creating objects
		TestScores testscores = new TestScores();
		
		//change fields
		System.out.println("Enter the first score");
		double score1 = kb.nextDouble();
		
		System.out.println("Enter the second score");
		double score2 = kb.nextDouble();
		
		System.out.println("Enter the third score");
		double score3 = kb.nextDouble();
		
		testscores.setScore1(score1);
		testscores.setScore2(score2);
		testscores.setScore3(score3);
		
		System.out.println("The average of the 3 scores entered is " + testscores.getAvrg());
	}

}
