package aLLassignments;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_boolean_double 
{
	public static void main(String[] args) {
//Int..	
	int num1[]=new int[3];
	num1[0]= 22;
	num1[1]=33;
	num1[2]=44;
	
	//System.out.println(Arrays.toString(num1)); 
					//OR
	for(int i=0; i<=2; i++)
	{
		System.out.println(num1[i]);
	}
//double,,
	double num2[]=new double[3];
	num2[0]= 4.3333;
	num2[1]=5.444;
	num2[2]=4.555;
	System.out.println(Arrays.toString(num2));
	/*for(int h=0; h<=2;h++)
	{
		System.out.println(num2[h]);
	}*/
//String..
	String s2[]= new String[3];
	s2[0]= "apple";
	s2[1]="mustard";
	s2[2]="sweet";
	
	/*for(int h=0; h<=2; h++)
	{
		System.out.println(s2[h]);
	}*/
	
	System.out.println(Arrays.toString(s2));
//boolean
	boolean v[]=new boolean[2];
	v[0]=true;
	v[1]=false;
	System.out.println(Arrays.toString(v));
	
	
	
	
	}

}
