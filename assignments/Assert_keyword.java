package aLLassignments;

import java.util.Scanner;

public class Assert_keyword {
public static void main(String[] args) {
//Write a program that uses an 'assert'statement to 
//verify if an input age is within 
//the range 0 to 65, and triggering an
//'AssertionError'if it is not.	
	
	
	System.out.println("The age of a person is:");
	
	Scanner a = new Scanner(System.in);
	int age = a.nextInt();
	
	assert age>=0 && age<=65:"The age range should be from 0 to 65";
	System.out.println("The age is within the range, and the age is:" + age);
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
}
