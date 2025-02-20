/*
 * Running payrate
 */
import java.util.*;
public class RunPayroll
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		//creating objects
		Payroll payroll = new Payroll();
		
		//Change fields
		System.out.println("Enter your name");
		String name = kb.nextLine();
		
		System.out.println("Enter your ID number");
		String id = kb.nextLine();
		
		System.out.println("Enter your payrate");
		double payrate = kb.nextDouble();
		
		System.out.println("Enter number of hours worked");
		double hours = kb.nextDouble();
		
		payroll.setName(name);
		payroll.setId(id);
		payroll.setPayrate(payrate);
		payroll.setHours(hours);
		
		//display
		System.out.println("Name: " + payroll.getName());
		System.out.println("ID number: " + payroll.getId());
		System.out.println("Payroll: $" + payroll.getPayroll());
	}
	
}