/*
 * Assignment 9; problem 1
 */
public class PersonalInfo 
{
	/***fields***/
	
	private String name;
	private String address;
	private String phone;
	private double age;
	
	/***Constructors***/
	
	public PersonalInfo()
	{
		name = "";
		address = "";
		phone = "";
		age = 0;
	}
	public PersonalInfo(String n, String a, String p, double ag)
	{
		name = n;
		address = a;
		phone = p;
		age = ag;
	}
	
	
	/***Other methods***/
	
	//setters
	public void setName(String n)
	{
		name = n;
	}
	public void setAddress(String a)
	{
		address = a;
	}
	public void setPhone(String p)
	{
		phone = p;
	}
	public void setAge(double ag)
	{
		age = ag;
	}
	public void setAll(String n, String a, String p, double ag)
	{
		name = n;
		address = a;
		phone = p;
		age = ag;
	}
	//getters
	public String getName()
	{
		return name;
	}
	public String getAddress()
	{
		return address;
	}
	public String getPhone()
	{
		return phone;
	}
	public double getAge()
	{
		return age;
	}
	
	public void getAll()
	{
		
		System.out.println("Name: " + name);
		System.out.println("Address: " + address);
		System.out.println("Phone number: " + phone);
		System.out.println("Age: " + age);
	}
	
	
}
