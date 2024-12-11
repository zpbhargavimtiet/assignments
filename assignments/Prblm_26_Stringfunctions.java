package aLLassignments;
public final class Prblm_26_Stringfunctions {
public static void main (String[]args)
{
//Find the index of a character 'c' in a given string.
//String a1 = "Welcome India"
	
	String a1 = "Welcome India";
	int res = a1.indexOf('c');
	System.out.println(res);
	
//ii)Retrieve the character at index '4'in a given string.
//String str = "Programming "	
	
	String str="Programming";
	char fi = str.charAt(4);
	System.out.println(fi);
//iii)Concatenate two strings.
  
	String str1 = "Hello";
    String str2 = "World";
   String finalres =str1.concat(str2); 
    System.out.println(finalres);
//)Extract a substring from the index '11' to the end of the string.

    String name = "Welcome to Java Programming";
    String q = (name.substring(11, name.length()));
    System.out.println(q);
//Extract a substring from index 0 to 11

    String P1 = "Programming is fun";
    String h = P1.substring(0, 11);
    System.out.println(h);
	
	
	
}
	
	
	
	
	
}
