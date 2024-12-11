package aLLassignments;

import java.util.HashMap;
import java.util.Map;

public class Prblm_58_keyset_ {
	public static void main(String[] args) {
		Map<String, String> m1 =new HashMap<>();
		m1.put("hari", "je"); // .put(Object);
		m1.put("mari", "je2");
		m1.put("kari", "je3");
		m1.put("vari", "je4");
		m1.put("chari", "je5");
		m1.put("jari", "je6");
		m1.put("uari", "je7"); 	
		System.out.println(m1);
		
		Map<String, String> m2 =new HashMap<>();
		m2.put("Raji", "drp");
		
		m1.putAll(m2);// .putAll(Map);
		System.out.println(m1);
		
		 
		System.out.println(m1.keySet());//with the help of keyset output is only keys
	
		//The return type of keySet is Set//
		
		for(String v : m1.keySet())
		{
			System.out.println(v);
		}
		
		
	
	
	}
	
	
	
	
	
}
