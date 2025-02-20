/*
 * Assignment 8; problem 2
 */
import java.util.*;
public class Painting 
{

	public static void main(String[] args) 
	{
		double ft, priceP, paint, cost, hours, lc,total;
		ft = wallSpace();
		priceP = paintprice();
		paint = required(ft);
		cost = cost(paint,priceP);
		hours = hours(ft);
		lc = laborCharges(hours);
		totalCost(cost,lc);
		
	}
	public static double wallSpace()
	{
		double ft;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the number of square feet that will be painted");
		ft = kb.nextDouble();
		
		return ft;
	}
	public static double paintprice()
	{
		double price;
		Scanner kb = new Scanner(System.in);
		
		System.out.println("Enter the price of paint per gallon");
		price = kb.nextDouble();
		
		return price;
	}

	public static double required(double ft)
	{
		double rq;
		rq = ft/115;
		return rq;
	}
	public static double cost(double rq, double p)
	{
		double money;
		
		money = rq*p;
		
		return money;
	}
	public static double hours(double ft)
	{
		double hrs;
		
		hrs = ft*(8/115);
		
		return hrs;
	}
	public static double laborCharges(double hrs)
	{
		double charges;
		
		charges = 18*hrs;
		
		return charges;
	}
	public static void totalCost(double p, double l)
	{
		double total;
		total = p+l;
		System.out.println("The total cost of the paint job is $" + total);
	}

}
