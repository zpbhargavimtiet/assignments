package aLLassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Prblm_60_EntrySetmap {
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
		
		
		for (Entry<String, String> z:m1.entrySet()) //this is the method of entrySet() which
			//gives the key and value in output and return type is entry.
		{
			System.out.println(z);
		}
		System.out.println("Now printing the while loop"); 
		
		Iterator<Entry<String, String>> N = m1.entrySet().iterator();
		//The return type is Iterator, for the entryset , this method is also used to do iterator
	//so we know iterator means, we have hasNext by using while loop.
		
		while(N.hasNext())
		{
			System.out.println(N.next());
		}
		
		
		
		
		
	}
	
	
	
	
	
}
