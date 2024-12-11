package aLLassignments;
public class Prblm27_Palindrome {
public static void main(String[] args) {
//Write a program to check if a given string is a palindrome.
	 
	String dr1= "rotator";
	String reverse_dr1 = "";
	System.out.println(dr1.length());
	
	for(int i=6; i>=0;i--)
	{
		char h = dr1.charAt(i);
		reverse_dr1 =reverse_dr1+h;
	}
		System.out.println(reverse_dr1);	 	
	
	if(dr1.equals(reverse_dr1))
	{
		System.out.println("Given String is Palindrome");
	}
	else
	{
		System.out.println("Given String is not Plaindrome");
	}
//Check if two strings are equal
   
	String s1 = "Java";
    String s2 = "java";
    
   boolean s3 = s1.equals(s2);
   System.out.println(s3);
	
//dispaly the trimmed string from the original string 

String m ="  A very Good Morning !  ";
String jj = m.trim();
System.out.println(jj);

	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
