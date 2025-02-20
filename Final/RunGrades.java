/*
 * Running Grades
 */
import java.util.*;
public class RunGrades 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		//Creating objects
		Grades student = new Grades();
		
		//Change fields
		System.out.println("Enter the student's name");
		String name = kb.nextLine();
		
		System.out.println("Ener the first test score");
		double test1 = kb.nextDouble();
		
		System.out.println("Enter the second test score");
		double test2 = kb.nextDouble();
		
		System.out.println("Enter the third test score");
		double test3 = kb.nextDouble();
		
		student.setName(name);
		student.setTest1(test1);
		student.setTest2(test2);
		student.setTest3(test3);
		
		//Output
		System.out.println(student.getName() + ":");
		System.out.println("First score: " + student.getTest1());
		System.out.println("Second score: " + student.getTest2());
		System.out.println("Third score: " + student.getTest3());
		System.out.println("The student's average is: " + student.getAvrg());
		
	}

}
