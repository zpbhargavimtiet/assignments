package aLLassignments;

import java.util.Date;

public class Time_38prblm {
public static void main(String[] args) {
	Date r = new Date();
	double jj = r.getTime();
	System.out.println(jj);
	Date rr = new Date(r.getTime());
	System.out.println(rr);
	String y = rr.toString();
	System.out.println(y);
	String time = y.substring(11, 19);
	System.out.println(time);
	String str = "Java"; 
	String str2 = "Java"; 
	System.out.println(str == str2);
}
}
