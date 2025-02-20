/*
 * Running RetailItem
 */
public class RunRetailItem 
{

	public static void main(String[] args) 
	{
		//creating objects
		RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
		RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
		RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
		
		//display
		System.out.println("Item 1");
		System.out.println("Description: " + item1.getDescription());
		System.out.println("Number of units: " + item1.getUnits());
		System.out.println("Price: $" + item1.getPrice());
		
		System.out.println("Item 2");
		System.out.println("Description: " + item2.getDescription());
		System.out.println("Number of units: " + item2.getUnits());
		System.out.println("Price: $" + item2.getPrice());
		
		System.out.println("Item 3");
		System.out.println("Description: " + item3.getDescription());
		System.out.println("Number of units: " + item3.getUnits());
		System.out.println("Price: $" + item3.getPrice());
	}

}
