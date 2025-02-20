package assignment1;

public class TemperatureConversion 
{

	public static void main(String[] args) 
	{
		// Celcius to Fahrenheit
		double celcius=25.3;
		double fahrenheit= ((9*celcius)/5)+32;
		System.out.print("25.3 degrees celcius is equal to ");
		System.out.println(fahrenheit + " degrees fahrenheit");
		
		// Fahrenheit to Celcius
		double F=20.58;
		double C= ((F-32)/9)*5;
		System.out.print("30 degrees fahrenheit is qual to ");
		System.out.print(C + " degrees celcius");

	}

}
