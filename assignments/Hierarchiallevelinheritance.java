package aLLassignments;
class parentclass
{
	
		
	 void authorization()
	{
		System.out.println("Login into flipkart");
	}
}

class subclass1 extends parentclass
{
	 static void page()
	{
		System.out.println("add items");
	}
}

class subclass2 extends parentclass
{
	 void gotoitems()
	{
		System.out.println("add items to cart");
		
	}
}


public class Hierarchiallevelinheritance extends parentclass
{
	 void logout()
	{
		System.out.println("logout successfully");
	}
public static void main(String[] args) 
{
	parentclass V = new parentclass();
	V.authorization();
	subclass1 M = new subclass1();
	V.authorization();
	M.page();
	subclass2 a = new subclass2();
	V.authorization();
	a.gotoitems();
	Hierarchiallevelinheritance b = new Hierarchiallevelinheritance();
	V.authorization();
	b.logout();
	
	
}

}
