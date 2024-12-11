package aLLassignments;
class Vehicle
{
	void num1()
	{
		System.out.println("My parent class is vehicle");
	}
}
public class Car extends Vehicle
{
	void num2()
	{
		System.out.println("My child class is car");
	}
public static void main(String[] args) 
{
	Car result = new Car();
	result.num2();
	result.num1();
}


}
