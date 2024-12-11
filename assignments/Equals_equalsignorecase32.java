package aLLassignments;
public class Equals_equalsignorecase32 {
public static void main(String[] args) {
//)find the output for the given string by using 'equals()' and 'equals
//IgnoreCase()' String methods?
	String str1= "Hello";
	String str2="hello";
//finding both are equal.by using equals function.
	boolean v = str1.equals(str2);
	System.out.println(v);
//hence this gives false as java is case senstive.so
//we ignore this casesenstive by using equalsIgonreCaseSenstive function

	boolean h = str1.equalsIgnoreCase(str2);
	System.out.println(h);
	//hence true..both are equal wen we ignored.
	
//Write a program that uses the 'contains()'method in the string class to check if the substrings: 
//"Java" and "Python" are present in the string?
	
	String nb = "Getting hands-on with Java is fun.";	
	boolean jh = nb.contains("Java");
	System.out.println(jh);
	boolean kj = nb.contains("Python");
	System.out.println(kj);
	
	
	
}
}
