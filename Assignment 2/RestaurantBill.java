/*
 * Assignment 2; problem 4
 */

import java.util.Scanner;

public class RestaurantBill {

	public static void main(String[] args) {
		// Declarations
		double appetizers, mainC, desert;
		double meal, tax, tip, total;
		
		Scanner kb = new Scanner(System.in);
		
		//Input
		System.out.println("Enter price of the appetizers");
		appetizers = kb.nextDouble();
		
		System.out.println("Enter price of the main course");
		mainC= kb.nextDouble();
		
		System.out.println("Enter price of the desert");
		desert = kb.nextDouble();
		
		//Processes
		meal = appetizers + mainC + desert;
		tax = meal*.0675;
		tip = (meal + tax)*.15;
		total = meal + tip;
		
		//Output
		System.out.println("The cost of your meal is $" + meal);
		System.out.println("Your tax is $" + tax);
		System.out.println("Your tip is $" + tip);
		System.out.println("Your total bill is $" + total);

	}

}
