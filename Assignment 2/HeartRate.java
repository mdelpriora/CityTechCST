/*
 * Assignment 2; problem 5
 */
import java.util.Scanner;

public class HeartRate {

	public static void main(String[] args) {
		
		// Declarations
		double age, heart;
		double trainingHR;
		
		Scanner kb = new Scanner(System.in);
		//Input
		System.out.println("Your age: ");
		age = kb.nextDouble();
		
		System.out.println("Your heart rate: ");
		heart = kb.nextDouble();
		
		//Processing
		trainingHR = .7*(220-age)+(.3*heart);
		
		//Output
		System.out.print("Your are " + age + " years old and ");
		System.out.println("your heart rate is " + heart);
		System.out.println("Your training heart rate is " + trainingHR);
		
	}

}
