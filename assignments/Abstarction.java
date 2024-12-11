package aLLassignments;
abstract class Student
{
	abstract void rollno();
	abstract void roomno();
}

public class Abstarction extends Student
{

	
	void rollno() 
	{
		System.out.println("1005555");
	}

	void roomno()
	{
		System.out.println("Class room no.5"); 
		
	}
public static void main(String[] args) {
	Abstarction Re = new Abstarction();
	Re.rollno();
	Re.roomno();
}
	
	
}
