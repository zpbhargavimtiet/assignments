package aLLassignments;

import java.util.Arrays;



public class Prblm_70 
{
	public static void main(String[] args) {
		//creating an array datatype//
		//1.declaration 
		//datatype[] varaiable = new datatype[size];
		//  or
		//datatype varaiable[] = new datatype[size];
		//		or
		//datatype varaiable[]; ....> decalaration
		//varaiable =new datatype[size];......>initilization
		//			or
		//datatype[] varaiable = {1,2,3,4,};.....> This is also can be done wen
		//we have array size..
		// 			or
		//datatype[] variable= new datatype[]{1,2,3,4}...> likw this also we can use
	
//1 Uisng for-loop.
		
		String name[] = new String[5];//object is created defaulty java will be created array of size 5.
		//now we call the array by its size.
		name[0]= "ma";
		name[1]="lucky";
		name[2]="java";
		name[3]="program";
		name[4]="hello";
		//now we use for loop to print the array alltogether
		for(int i=0 ; i<name.length; i++)
		{
			System.out.println(name[i]); //calling at every index
		}
		System.out.println(Arrays.toString(name));
//2.using for each loop:
		 
		for(String value:name) {
			System.out.println(value);
		}
//3.using Printout statement:
		
		System.out.println("Printing every index of element using print statement:");
		System.out.println(name[0]);
		System.out.println(name[1]);
		System.out.println(name[2]);
		System.out.println(name[3]);
		System.out.println(name[4]);
		
//4. Uisng array Function
		System.out.println(Arrays.toString(name));
		
	}
	
	
	
	
	
	
}
