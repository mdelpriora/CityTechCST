/*
 * Assignment 9; problem 4
 */
public class TestScores 
{
	//Fields
	private double score1;
	private double score2;
	private double score3;
	//Constructors
	public TestScores()
	{
		score1 = 0;
		score2 = 0;
		score3 = 0;
	}
	public TestScores(double a, double b, double c)
	{
		score1 = a;
		score2 = b;
		score3 = c;
	}
	//Other methods
	//Setters
	public void setScore1(double a)
	{
		score1 = a;
	}
	public void setScore2(double b)
	{
		score2 = b;
	}
	public void setScore3(double c)
	{
		score3 = c;
	}
	//Getters
	public double getScore1()
	{
		return score1;
	}
	public double getScore2()
	{
		return score2;
	}
	public double getScore3()
	{
		return score3;
	}
	public double getAvrg()
	{
		return (score1+score2+score3)/3;
	}
}
