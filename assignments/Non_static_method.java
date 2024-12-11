package aLLassignments;

public class Non_static_method {
	// Non-static method//
	
			void sub()
			{
				int a = 30, b = 50;
				int res= (a-b);
				System.out.println("subtraction result :" +res);
			}
			void multi()
			{
				int c = 20, d = 30;
				int total =(c*d);
				System.out.println("Multiplication result :" +total);
			}
		
	public static void main(String[] args) 
	{
		Non_static_method output = new Non_static_method();
		output.sub();
		
		Non_static_method finaloutput = new Non_static_method();
		finaloutput.multi();
		
	}
}