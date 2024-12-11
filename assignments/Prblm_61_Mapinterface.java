package aLLassignments;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Prblm_61_Mapinterface {

	public static void main(String[] args) {
		
		Map<Integer, String> h = new HashMap<>();
		h.put(1, "one");
		h.put(2, "two");
		h.put(3, "three");
		h.put(4, "four");
		h.put(5, "five");
		System.out.println(h);
		
		Iterator<Entry<Integer, String>> kk = h.entrySet().iterator();
		while(kk.hasNext())
		{
			System.out.println(kk.next());
		}
		//hence above is a method of iteration to get key and value..
		//as we use iterator
		//while loop hasNext is used..
		
	}
	
	
	
	
	
	
}

