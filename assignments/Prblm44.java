package aLLassignments;

import java.util.Arrays;
import java.util.Scanner;

public class Prblm44 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size_ = sc.nextInt();
		
		int num1[] = new int[size_];
		System.out.println("The size of the array is: " + size_);

		System.out.println(Arrays.toString(num1));
	
		
		for(int i =0; i<size_; i++)
		{
			num1[i]=sc.nextInt();
		}
		
		
		for(int i =0; i<size_; i++)
		{
			System.out.println(num1[i]+ " ");
		}
		
		System.out.println(Arrays.toString(num1));
				

	}

}
