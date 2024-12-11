package aLLassignments;

public class Employeedetails 
{

	Employeedetails(String name)
	{
		
		System.out.println("My name is PADMA");
	
	}
	Employeedetails(int id)
	{
		this("bharu");
		System.out.println("my id no is 10555");
	}
	Employeedetails(String company, String designation)
	{
		this(20);
		System.out.println("i am working in Grotech mind company & QA designation");
		
	}
	Employeedetails(double salary)
	{
		this("amazon","QA");
		System.out.println("my salary is 50,000");
	}

	public static void main(String[] args) {
		
		new Employeedetails(2.22);
		
	}
}
