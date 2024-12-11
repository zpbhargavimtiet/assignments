package aLLassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Prblm41_Set {
public static void main(String[] args) {
	
	
	Set s1=new HashSet();
	s1.add(78);
	s1.add(89);
	s1.add(20);
	s1.add(40);
	s1.add(89);
	s1.add(40);
	s1.add(null);
	
	System.out.println(s1);
	
	Set<String> h = new HashSet<>();
	h.add("44");
	h.add("66");
	h.add("789");
	h.add("33");
	System.out.println(h);
	h.addAll(s1);
	System.out.println(h);
	//h.clear();
	//System.out.println(h);
	System.out.println(h.contains(89));
	 Iterator k=h.iterator();
	 while(k.hasNext())
	 {
		 System.out.println(k.next());
	 }
	
	
	
}
	
}
