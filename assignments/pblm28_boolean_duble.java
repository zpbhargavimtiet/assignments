package aLLassignments;

import java.util.Arrays;
import java.util.Scanner;

public class pblm28_boolean_duble {
public static void main(String[] args) {
//Write a Java program to create and display an array of boolean and double data types. 
//Initialize the arrays with some sample values and display them in array form.
	
	boolean a8[]=new boolean[3];
	System.out.println("Enter the input values");
	Scanner xs=new Scanner(System.in);
	 for(int i=0; i<=2; i++)
	 {
		 a8[i] = xs.nextBoolean();
	 }
	
	System.out.println(Arrays.toString(a8));
	
	
	double a9[] = new double[3];
	System.out.println("enter the input values");
	Scanner bs = new Scanner(System.in);
	for(int i=0; i<=2; i++)
	{
		a9[i]=bs.nextDouble();
	}
	System.out.println(Arrays.toString(a9));
	
}
}
