package aLLassignments;
import java.util.Arrays;
public class Prblm69_arraysequalornot {
public static void main(String[] args) {
//1 approach	
	int arr1[] = new int[4];
	arr1[0]=1;
	arr1[1]=2;
	arr1[2]=3;
	arr1[3]=4;
	System.out.println(Arrays.toString(arr1));
	
	int arr2[] = new int[4];
	arr2[0]=1;
	arr2[1]=2;
	arr2[2]=3;
	arr2[3]=4;
	System.out.println(Arrays.toString(arr2));
	//comparing 2 arrays equal or not
	boolean status = Arrays.equals(arr1, arr2);
	System.out.println(status);
	System.out.println("Hence the arrays are equal in 1st approach");
	
//2 approach
	int[] var= {1,2,3,4};
	int[] var2= {1,2,3,4};
	//checking the length of array..if we dontno the array elements..
	//if length equal we can proceed for next
	 if(var.length == var2.length)
	 {
		 System.out.println("Hence the length of arrays are equal proceed for futher");
		 for(int i=0; i<var.length;i++)
		 {
			if(var[i]!=var2[i])
			{
				System.out.println("The arrays are not equal");
			}
		 } 
	 }
	 else
	 {
		 System.out.println("Given arrays length is not equal");
	 }
	if(var.length==var2.length)
	{
		System.out.println("The arrays are equal in 2nd approach also");
	}
	else
	{
		System.out.println("The arrays are not equal");
	}
	
	
	
	
}
	
	
	
}
