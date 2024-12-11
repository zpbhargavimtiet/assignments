package aLLassignments;

public class Methodoverloadingconcept {
//Method over loading concepts- Static & non-static/add by int,double,string//
	
	static void addition()
	{
		int a =20,b=30;
		System.out.println(a+b);
	}
	static void add()
	{
		double a =111111,b=333333;
		System.out.println(a+b);
	}
	static void sum()
	{
		String a1 ="20", b1 ="30";
		System.out.println(a1+b1);
	}
	void adding_two_numbers()
	{
		int a2=100,b2=20;
		System.out.println(a2+b2);
	}
	
	public static void main(String[] args) {
		addition();
		add();
		sum();
		Methodoverloadingconcept result = new Methodoverloadingconcept();
		result.adding_two_numbers();

	}

}
