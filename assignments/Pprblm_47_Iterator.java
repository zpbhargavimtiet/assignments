package aLLassignments;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pprblm_47_Iterator {
public static void main(String[] args) {
	List<String> animals = new ArrayList<>();
	animals.add("dog");
	animals.add("cat");
	animals.add("monkey");
	animals.add("cow");
	System.out.println(animals);
	
	Iterator<String> jj = animals.iterator();
	while(jj.hasNext())
	{
		System.out.println(jj.next());
	}
	
	animals.remove(0);
	System.out.println(animals);
	
	
	
	
}
	
	
	
	
}
