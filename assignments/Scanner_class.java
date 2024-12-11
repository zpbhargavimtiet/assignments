package aLLassignments;

import java.util.Scanner;

public class Scanner_class {
public static void main(String[] args) {
/*Demonstrate the Scanner class usage by taking 
	user inputs of a student like ID,Name,
	,College,Branch,phone_no and print the same*/
	
	System.out.println("The id number of student is:");
	Scanner userinput = new Scanner(System.in);
	int idnum = userinput.nextInt();
	System.out.println("Name of the student is:");
	String name =userinput.next();
	System.out.println("College name is:");
	String college=userinput.next();
	System.out.println("Branch name is:");
	String branch = userinput.next();
	System.out.println(name +" " + "phone _no is:");
	int phone_no = userinput.nextInt();
	System.out.println(" The details of student are below:");
	System.out.println(idnum);
	System.out.println(name);
	System.out.println(college);
	System.out.println(branch);
	System.out.println(phone_no);
	
	
	
	
	
	
	
	
	
}
	
	
	
	
}
