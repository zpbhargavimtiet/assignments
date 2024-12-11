package aLLassignments;

import java.util.HashMap;
import java.util.Map;

public class Prblm_59_foreach_mapinterface {
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
		//System.out.println(m1.isEmpty());//  .isEmpty();
		
		//m2.clear();
		//System.out.println(m2);
		
		//System.out.println(m2.isEmpty()); //checks whether the list is empty..
		 
		System.out.println(m1.keySet());//with the help of keyset output is only keys
		//System.out.println(m1.values());//with the help of values output is only values
		//The return type of keySet is Set//
		
		for(String v : m1.keySet())
		{
			System.out.println(v);
		}
		
		//above is for each loop which iterates single single keys..
		//return type of values is ..depending on the datatype. 
		//for(String b : m1.values())
		//{
			//System.out.println(b);
		//}
		
		//Above is for each loop which iterates single single values
	
	
	
	
	
	
	}
	
	
	
}
