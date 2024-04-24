package lambdaExpressions;

interface A
{
	public void m1();
}
interface B
{
	public void m2(String s);
}
interface C
{
	public int m3();
}
interface D
{
	public int m4(int x,int y);
}
public class Demo3 
{
	public static void main(String[] args) 
	{
		A a = ()->System.out.println("No argument no return type");
		a.m1();
		B b = (s)->System.out.println(s);
		b.m2("One argument no return type");
		C c = ()->
		{
			System.out.println("No argument with int return type");
			return 10+20;
		};
		
		System.out.println(c.m3());
		D d = (s1,s2)->
		{
			return s1+s2;
		};
		System.out.println(d.m4(20, 40));
	}
}