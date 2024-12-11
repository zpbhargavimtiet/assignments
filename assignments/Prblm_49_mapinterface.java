package aLLassignments;

import java.util.HashMap;
import java.util.Map;

public class Prblm_49_mapinterface {
public static void main(String[] args) {
	//1 Name & Bodyweight//
	
	Map<String,Integer> details = new HashMap<>();
	details.put("AB", 40);
	details.put("BC", 56);
	details.put("DD", 56);
	System.out.println("The name and bodywieght are:");
	System.out.println(details);
	
	//2 Bankname & bankaccountid//
	Map<String , Long> bank = new HashMap<>();
	bank.put("sbi",123456666l);
	bank.put("andhra bank", 1234557777l);
	bank.put("jet bank", 453000123366l);
	System.out.println("The Bankname & bankaccountid are:");
	System.out.println(bank);
	
	//3 Firstname Lastname//
	Map<String,String> names = new HashMap<>();
	names.put("rosey", "ayyar");
	names.put("pinky", "maheer");
	names.put("blue", "joshn");
	System.out.println("The Firstname & Lastname are:");
	System.out.println(names);
	
	//4 List of Household Items and their Quantities
	Map<String , Double> item = new HashMap<>();
	item.put("Rice", 500.50);
	item.put("wheat", 200.20);
	item.put("sugar", 100.0);
	System.out.println("The Household Items and their Quantities are:");
	System.out.println(item); 
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
}
