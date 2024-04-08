package defaultMethods;

interface A5
{
	public void m1();
	public static void m2()
	{
		System.out.println("static method");
	}
}
class A6 implements A5
{
	@Override
	public void m1() 
	{
		System.out.println("A6 class");
	}
}
public class StatcMethodTest 
{
	public static void main(String[] args) 
	{
		A6 a1 = new A6();
		A5.m2();
		a1.m1();	
	}
}