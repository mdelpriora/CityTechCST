/*
 * Running personalInfo
 */
import java.util.*;
public class RunPersonalInfo 
{

	public static void main(String[] args) 
	{
		Scanner kb = new Scanner(System.in);
		//Creating objects
		PersonalInfo p1 = new PersonalInfo();
		PersonalInfo p2 = new PersonalInfo("bob", "300 JAY ST", "1234290495", 18.5);
		PersonalInfo p3 = new PersonalInfo();
		
		//change fields
		System.out.println("Enter your name");
		String n = kb.nextLine();
		
		System.out.println("Enter your address");
		String ad = kb.nextLine();
		
		System.out.println("Enter your phone number");
		String p = kb.nextLine();
		
		System.out.println("Enter your age");
		double ag = kb.nextDouble();
		
		p1.setName(n);
		p1.setAddress(ad);
		p1.setPhone(p);
		p1.setAge(ag);
		
		p3.setAll(n, ad, p, ag);
		
		//display
		System.out.println("First personal information is: ");
		System.out.println("Name:" + p1.getName() + " Address:" + p1.getAddress() + " Phone #:" + p1.getPhone() + " Age:" +  p1.getAge());
		
		System.out.println("Second personal information is:");
		System.out.println("Name: " + p2.getName() + " Address:" + p2.getAddress() + " Phone #:" + p2.getPhone() + " Age:" +  p2.getAge());
		
		System.out.println("Third personal information is: ");
		p3.getAll();
		
	}

}
