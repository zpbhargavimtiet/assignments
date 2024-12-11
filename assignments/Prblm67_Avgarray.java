package aLLassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Prblm67_Avgarray {
//Avg. 10,20,30,40,50..> 10+20+30+40+50=150/5 =30 avg is 30..we need to declare in array
	public static void main(String[] args) {
		
	//step1: user gives the values
		Scanner user = new Scanner(System.in);
		System.out.println("Enter how many numbers u want ?");
		//user will stored numbers in a variable elements
		int elements = user.nextInt();
		
		System.out.println("Enter " + elements + " numbers in a array");
		//the elements should be in a array form and the variable is
		//elements_
			
		int elements_[] = new int[elements];
		
		int sum =0;
		
		for(int i =0; i<elements ; i++)
		{
			elements_[i]=user.nextInt();
			sum+=elements_[i];
		}
		System.out.println(Arrays.toString(elements_));
		System.out.println("Avgerage of array is :"+ sum/elements);
		
	}	
	   /*i=0; i<elements ; elements_[i]; sum+=elements_[i];i++ 
	 	i=0, 0<5 T, elements_[0] = 10, 0+10=10,i++ = 0+1=1;
		i=1,1<5 T, elements_[1] = 20, 10+20=30, i++ = 1+1=2;
		i=2, 2<5, T ,elements_[2]=30, 30+30=60, i++ =2+1=3;
		i=3,3<5 T ,elements_[3]=40, 60+40= 100, i++=3+1=4;
		i=4, 4<5 T, elemets_[4]=50, 100+50 =150,i++=4+1=5;
		i=5,5<5 F, for loop exits from loop.*/
	
	
	
}
