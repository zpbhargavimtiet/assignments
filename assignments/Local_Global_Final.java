package aLLassignments;

public class Local_Global_Final {
	static int a =3; 	 //global variable with static modifier
	static int b =3;	//global variable with static modifier
	int c = 2; //global variable with non static modifier(wich we canot mention)
	int d =2; ////global variable with non static modifier(wich we canot mention
	
	static void add() {
		System.out.println(a+b); //static method for global variable
	}
	
	static void sub() 
	{
		int a =1,b=2; //Inside method for local variables a,b
		System.out.println(a-b);
	}
	
	void mul() {	//nonstatic method for global variables
		System.out.println(c*d);
	}
//Final Variable://
	  
		static void sum()
		{
			final int num1=30, num2=20;
			System.out.println(num1+num2);
		}
		
	public static void main(String[] args) {
		
	add();
	sub();
	
	Local_Global_Final M = new Local_Global_Final();
	M.mul();
	
	sum();
	
	}
	
	
	
	
	
	
	

}
