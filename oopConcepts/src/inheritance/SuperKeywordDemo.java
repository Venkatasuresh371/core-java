package inheritance;

class Parentclass
{
	Parentclass() 
	{
		System.out.println("Constructor of Superclass");
	}
	Parentclass(int a) 
	{
		System.out.println("Constructor of Superclass with parameter");
	}
}
class ChildClass extends Parentclass
{
	ChildClass()
	{
//		super(); implicit super class constructor
		System.out.println("ChildClass constructor without parameter");
	}
	ChildClass(int a)
	{
		super(10); //explicit super class constructor
		System.out.println("ChildClass constructor with parameter");
	}
	public void display()
	{
		System.out.println("Display method");
	}
}

public class SuperKeywordDemo
{
	public static void main(String[] args)
	{
		ChildClass cc = new ChildClass();
		cc.display();
		System.out.println();
		ChildClass cc1 = new ChildClass(10);
		cc1.display();
	}

}
