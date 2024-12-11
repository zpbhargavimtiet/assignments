package aLLassignments;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class Prblm_56_Enumeration {
	public static void main(String[] args) {
		
		Vector v3 = new Vector();
		v3.add("dog");
		v3.add("tiger");
		v3.add("lion");
		v3.add("deer");
		System.out.println(v3);
		Enumeration l=v3.elements();
		while(l.hasMoreElements())
		{
			System.out.println(l.nextElement());
		}
		
		
		
		
		

	}

}
