package aLLassignments;
public class Prblm_34_ {
public static void main(String[] args) {
//matches
//write a program for the below.The given String= "myJava"
	
	//i)check if the given string is consists of the exact 6 letters?	
	String jk = "myJava";
	boolean kk = jk.matches("......");
	System.out.println("String consists 6 letters and answer is:" +kk); 
	
	//ii)check if the String starts with 'm' ?	
	
	boolean lk = jk.matches("(m.(.*))");
	System.out.println("Is the String starts with m and it is:" + lk);
	
	
	//iii)check if the String ends with 'y' ?
	boolean ll = jk.matches(("(.*)y"));
	System.out.println("Is the String starts with Y and it is:" + ll);
	
	
	
	
	
	
	
	
}
}
