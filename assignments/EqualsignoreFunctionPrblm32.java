package aLLassignments;
public class EqualsignoreFunctionPrblm32 {
public static void main(String[] args){

//a)find the output for the given string by using 'equals()' and 'equalsString2="java"
	String nn="java";
	String mm="Java";
//step1:checking the both strings are equal
	boolean kk = nn.equals(mm);
	System.out.println(kk);//false
//Since it is not equal we ignore the case senstive the function is:
	boolean jj =nn.equalsIgnoreCase(mm);
	System.out.println(jj);//afterignoring it is true.
	
	boolean ki = nn.contains("Java");
	System.out.println("Is my string conatins Java?" + ki);
	boolean ji = mm.contains("Python");
	System.out.println("Is my String contains Python?" + ji);

	
	



}

}

