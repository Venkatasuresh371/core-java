package examples;

public class Test1
{
	static int a=10;
	int b = 30;
	public static void main(String[] args)
	{
		int a = 40;
		Test1 t1 = new Test1();
		System.out.println(Test1.a);
		System.out.println(t1.b);
		System.out.println(a);
	}
}