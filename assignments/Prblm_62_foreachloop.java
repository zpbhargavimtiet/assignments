package aLLassignments;

import java.util.Arrays;

public class Prblm_62_foreachloop {
public static void main(String[] args) {
	
	int[] numbers = new int[5];
	numbers[0] = 10;
	numbers[1] = 10;
	numbers[2] = 20;
	numbers[3] = 30;
	numbers[4] = 33;
		System.out.println(Arrays.toString(numbers)); 
		int sum =0;
		for(int jk : numbers)
		{
			sum+=jk;
		}
			
			System.out.println(sum);
			
			
			
		}
	
	
	
	
	
	
	
}

