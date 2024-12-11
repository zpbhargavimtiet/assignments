package aLLassignments;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Prblm_63ListIterator {
//Firstly ListIterator is only applicable for List Interface//
public static void main(String[] args) {
	
	List j = new ArrayList();
	//Now we can use the properties of List interface.//
	j.add("Hello");//add(Object);
	j.add("how");
	j.add("why");
	j.add("many");
	j.add("soo");
	j.add(null);
	j.add(56);
	j.add(99);
	j.add("money");
	System.out.println(j);//we see List follows indexing, order of insertion
	j.add("why");
	j.add(null);
	System.out.println(j);//we also seen list allows duplicates & null values
	
	List m = new ArrayList();
	m.add("man");
	m.add("very");
	System.out.println(m);
	j.addAll(m);//addAll(Collection);
	System.out.println(j);
	j.add(0, "muchmore");//add(int index, Object);we can add at any index object
	System.out.println(j);
	
	ListIterator K = j.listIterator();//forward iteration
	while(K.hasNext())
	{
		System.out.println(K.next());
	}
	System.out.println("Above is a forward iteration");
	System.out.println("Below are backward iteration");
	
	while(K.hasPrevious())//backward iteration
	{
		System.out.println(K.previous());
	}
	j.set(1, 78);//set(int index, Object);
	System.out.println(j); 
	








}	
	
}
