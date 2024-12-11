package aLLassignments;
class number1
{
	static void add()
	{
		System.out.println("add");
	}
}
class number2 extends number1
{
	static void mul()
	{
		System.out.println("mul");
	}
}
class number3 extends number2
{
	static void sub()
	{
		System.out.println("sub");
	}
}
class number4 extends number3
{
	void div()
	{
		System.out.println("div");
	}
}
public class Multilevelinheritance extends number4
{

	void sum()
	{
	System.out.println("sum");	
	}
	public static void main(String[] args) {
	
		Multilevelinheritance result = new Multilevelinheritance();
		result.sum();
		result.div();
		sub();
		mul();
		add();
	
	}

}
