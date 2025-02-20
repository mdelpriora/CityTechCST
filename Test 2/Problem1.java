/*
 * Test 2; problem 1
 */
public class Problem1 
{

	public static void main(String[] args) 
	{
		//Declarations
		double money, goal;
		int year, count=0;
		//Input
		money=1000;
		goal=1000000;
		
		//Processing
		while (money<goal)
		{
			money = money + (money*.07);
			count++;
			System.out.println("You will have $" + money + " after " + count + " years");
		}
		System.out.println("You will be a millionaire after " + count + " years");

	}

}
