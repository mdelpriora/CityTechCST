package assignment1;

public class CalculatingArea 
{

	public static void main(String[] args) 
	{
		// Area
		int radius=4;
		double area= Math.PI*(radius*radius);
		System.out.println("The area is " + area);
		
		//Circumference
		double circumference= Math.PI*radius*2;
		System.out.println("The circumference is " + circumference);

	}

}
