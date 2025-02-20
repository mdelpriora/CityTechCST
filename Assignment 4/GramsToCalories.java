/*
 * Assignment 4, problem 5
 */
import java.util.Scanner;

public class GramsToCalories {

	public static void main(String[] args) {
		//Declarations
				String item;
				
				double fat, protein, carbs, fcal, pcal, ccal, totalcal, percent;
				
				Scanner kb = new Scanner(System.in);
				//Input
				System.out.println("Enter the name of a menu item");
				item = kb.nextLine();
				
				System.out.println("Enter the grams of fat in the item");
				fat = kb.nextDouble();
				
				System.out.println("Enter the grams of protein in the item");
				protein = kb.nextDouble();
				
				System.out.println("Enter the grams of cards in the item");
				carbs = kb.nextDouble();
				
				//Processing
				fcal = fat*9;
				pcal = protein*4;
				ccal = carbs*4;
				
				totalcal = fcal + pcal + ccal;
				
				percent = (fcal/totalcal)*100;
				//Output
				System.out.println(item + "has a total of " + totalcal + " calories");
				System.out.println(percent + "% of the calories in this item come from fat");

	}

}
