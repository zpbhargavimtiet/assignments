package aLLassignments;

import java.util.Arrays;

public class AnagaramQ31 {
public static void main(String[]args)
{
//Write a program to check if the two given strings
	//are Anagrams in JAVA?
	
	String one="listen";
	String two ="silent";
	char[] j =one.toCharArray();
	char[] l =two.toCharArray();
	Arrays.sort(j);
	Arrays.sort(l);
	System.out.println(Arrays.toString(j));
	System.out.println(Arrays.toString(l));
	boolean v  = Arrays.equals(j, l);
	System.out.println(v);
	if(v==true)
	{
		System.out.println("the strings are Anagram");
	}
	else
	{
		System.out.println("The given stringsbare not annagram");
	}
	
	
	
	
	
}
	
	
	
	
	
	
	
}
