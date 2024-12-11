package aLLassignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Prblm_55_Collections_ {
public static void main(String[] args) {
	List<Integer> aa = new ArrayList<>();
	aa.add(90); //0  
	aa.add(30);//1	 
	aa.add(30);//2	
	aa.add(33);//3  
	aa.add(1);//4   
	aa.add(4);//5   
	System.out.println(aa);
	Collections.sort(aa);//sorted collections list
	System.out.println(aa);
	Integer kl = Collections.max(aa);
	System.out.println(kl);
	Integer k2=Collections.min(aa);
	System.out.println(k2);
	Collections.reverse(aa);
	System.out.println(aa);
	Collections.shuffle(aa);
	System.out.println(aa);
	Collections.swap(aa, 0, 1);
	System.out.println(aa);
	
	
	
	
}
}
