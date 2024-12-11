package aLLassignments;

public class Replace_all_function_33 {
public static void main(String[] args) {
//Assignment 33
//write a program for the below.here, String input= "Hello! 123Bye 789 "	
//i) Replace all numeric characters in a given string with an empty string ("").	

	String input1="Hello! 123Bye 789 ";
	System.out.println(input1.replaceAll("[0-9]", ""));
//ii)Replace all capital letters in a given string with an empty string ("")	
	
	System.out.println(input1.replaceAll("[A-Z]",""));
//iii)Replace all lower letters in a given string with an empty string ("").
	
	System.out.println(input1.replaceAll("[a-z]", ""));
//iv)Replace the letter 'e' with 'y'*/	
	System.out.println(input1.replace('e', 'y'));
	
	
	
	
	
	

	}

}
