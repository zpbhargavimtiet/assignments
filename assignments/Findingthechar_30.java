package aLLassignments;

import java.util.Arrays;

public class Findingthechar_30 
{
	static int countofalphabet=0;
	static int countofdigit=0;
	static int countofwhitespace=0;
public static void main(String[] args) {
//find the below from the given string: " Hello! 123@ jAvA_"
//a)Number of alphabets used?
		//	b)Number of numeric used?
		//	c)Specail characters used?
		//	d)Spaces used?	
	
	String S = "Hello! 123@ jAvA_";
	char[] M = S.toCharArray();
	System.out.println(Arrays.toString(M));
	for(int i=0; i<S.length();i++)
	{
		boolean b1 =Character.isAlphabetic(M[i]);
		
	if(b1==true)
	{
		countofalphabet++;
	}
	}
	
	System.out.println("The count of alphabets:"+countofalphabet);
	
	
	for(int i=0; i<S.length();i++)
	{
		
		boolean b2 =Character.isDigit(M[i]);
		
	if(b2==true)
	{
		countofdigit++;
	}
	}
	
	System.out.println("The count of digits:"+countofdigit);
	

	for(int i=0; i<S.length();i++)
	{
		
		boolean b3 =Character.isWhitespace(M[i]);
		
	if(b3==true)
	{
		countofwhitespace++;
	}
	}
	
	System.out.println("The count of whitespace:"+countofwhitespace);
	
int countofspecialcharacters=S.length()-((countofalphabet+countofdigit+countofwhitespace));
	System.out.println("count of special characters :"+countofspecialcharacters);

	
	
	
}
	
}
