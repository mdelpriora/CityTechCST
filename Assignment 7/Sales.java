/*
 * Assignment 7; problem 4
 */
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Sales 
{

	public static void main(String[] args) throws IOException 
	{
		//Declarations
		String name;
		int days=0;
		double sales=0, total=0, avrg=0;
		
		Scanner kb = new Scanner(System.in);
		//Arraylist
		ArrayList<Double>list = new ArrayList <Double>();
		
		//get file
		System.out.println("Enter the file name");
		name = kb.nextLine();
		
		//Opening file
		File myF = new File(name);
		Scanner inputFile = new Scanner(myF);
		
		//Read file
		while (inputFile.hasNext())
		{
			sales = inputFile.nextDouble();
			list.add(sales);
		}
		//Close file
		inputFile.close();
		
		//Calculate total + avrg
		
		for (int i=0; i<list.size(); i++)
		{
			total = total + list.get(i);
		}
		avrg = total/list.size();
		
		System.out.println("The number of days is: " + list.size());
		System.out.println("The total sales are: " + total);
		System.out.println("The average is: " + avrg);
	}

}
