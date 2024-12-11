package aLLassignments;

public class Staticnonstatic {
//5methods-3 static, 2 non-static methods should call from main method.
	static void add() //static method
	{
	int a=10,b=20;
	int c=a+b;
	System.out.println(c);
	}
	static void sub() //static method
	{
	int a1=10,b1=20;
	int c1=a1+b1;
	System.out.println(c1);
	}
	static void multi() //static method
	{ 
	int a2=20,b2=30;
	int d=a2+b2;
	System.out.println(d);
	}
	void div()	//nonstatic method 
	{
		int x=10,y=20;
		int res=x*y;
		System.out.println(res);
	}
	void modulo() // non static method
	{
		int A = 20,B=10;
		int res = A%B;
		System.out.println(res);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		multi();
		Staticnonstatic Result = new Staticnonstatic();
		Result.div();
		Staticnonstatic Res = new Staticnonstatic();
		Res.modulo();

	}

}
