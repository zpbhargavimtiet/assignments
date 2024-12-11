package aLLassignments;

import java.util.Scanner;

public class Switch_case {
public static void main(String[] args) {
//  Write a program using switch statement to print the days of the week//
	System.out.println("what is the day name of tomorrow? :");
	Scanner day = new Scanner(System.in);		
	int name_of_day=day.nextInt();
	
	switch(name_of_day) 
	{
	case 1 : System.out.println("Sunday");
			break;
	case 2 : System.out.println("Monday");
			break;	
	case 3 : System.out.println("Tuesday");
			break;
	case 4 : System.out.println("Wednesday");
			break;
	case 5 : System.out.println("Thrusday");
			break;
	case 6 : System.out.println("Friday");
			break;
	case 7 : System.out.println("Saturday");
			break;
	default:
			System.out.println("None of the day");
	
	
	
	
	}
	
	
	
	
	
	
	}
			

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

