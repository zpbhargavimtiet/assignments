package aLLassignments;

import java.util.Arrays;

public class Prblm_35_ {
public static void main(String[] args) {
//Assignment 35

//i)Write a program to split the string "Java is fun" into individual words.	
	
	String oo = "Java is fun";
	String[] kk = oo.split(" ");
	System.out.println(Arrays.toString(kk));
	
//ii)Split the string "Java Python C++" using a comma.
	
	String hh = "Java Python C++";
	String[] lm = hh.split(" " ,3);
	System.out.println(Arrays.toString(lm));
//iii)Split the string "Java is fun to learn" 
//into at most 3 parts.	
	
	String ol = "Java is fun to learn";
	String[] ok = ol.split(" " , 4);
	System.out.println(Arrays.toString(ok)); 
	
//iv)Write a program to split a sentence into words, count the words, 
//and print them.
	
	String hoo = "My name is Padma";
	String[] jk = hoo.split(" ", 4);
	String ko = Arrays.toString(jk);
	System.out.println(ko);
	int ki = ko.length();
System.out.println(ki);
	
	
	
	
	
	
	
} 

	
	
	
	
	
	
	
	
}
