package aLLassignments;

import java.util.Arrays;
import java.util.Vector;

public class Prblm_53_Vector {
	public static void main(String[] args) {
			Vector v4 = new Vector();

		System.out.println(v4);
			v4.add("yadu"); 
			v4.add("how");
			v4.add("manu");
			System.out.println(v4);
			v4.add(0, "manch"); //adding the element in index 0
			System.out.println(v4);
			v4.add("keer");
			v4.add("y2");
			v4.add("y6");
			v4.add("g3");
			v4.add("gh");
			v4.add("fg");
			System.out.println("The total list of v4" +v4);
		//Vector will be increased its capacity by 100%	
			System.out.println(v4.size());//10, this gives size of element
			System.out.println(v4.capacity());//10, this gives default & intial capacity 10 for Vector
			v4.add("dff");
			System.out.println(v4.capacity());//20
			System.out.println(v4.size());//size is 11
		//capacity is ntg but Array capacity internally it is created wen u debug.
			 Vector v2 = new Vector();
			 v2.add("gow");
			 v2.add("how");
			 v2.add("keer");
			 v4.addAll(v2);
			 System.out.println(v4);
			// System.out.println(v4.addAll(v2));
			 System.out.println(v4.get(1));//this is a method of index..to get the data
			 //to remove data:
			 System.out.println("removing 0 index element: " + (v4.remove(0)));
			 System.out.println(v4);
			 v4.remove(0); //remove()with index passing
			 v4.remove("how"); //remove()with object passing
			 v4.removeAll(v2); //removeAll()elements of other reference.Varible passing
			 v4.removeAllElements();
			 System.out.println(v4);//henece removed all list present in v4.
			 v4.clear();
			 System.out.println(v4);
			 System.out.println(v4.contains("how"));//this method checks specific object present or not
			 System.out.println(v4.containsAll(v2));//checks all v2 methods are there or not// 
			 v4.set(2, "satish");//updating the value by using set.
			 System.out.println(v4);
			 System.out.println(v4.lastIndexOf("keer"));
		//hence keer is a duplicate value, so it gives last index of keer.ie 12
			 System.out.println(v4.lastElement());
		//without passing index we get lastElement..
			 System.out.println(v4.firstElement());
		//without passing index we firstElement...
			//entire list is convereted to array
			 Object[] kk = v4.toArray();
			 System.out.println(Arrays.toString(kk));
		//hence array is created..// 
			 Vector gh = new Vector(100);
			 gh.add("kk");
			 gh.add("kl");
			 System.out.println(gh.size());//size gives -2
			 System.out.println(gh.capacity());//capacity gives 100.
			 //so we can also gives the capacity beforen itself.
			 
			 
		}
		}

