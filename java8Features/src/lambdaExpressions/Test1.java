package lambdaExpressions;

interface A1
{
	public void m1();
}
class A1Impl implements A1
{
	@Override
	public void m1() 
	{
		System.out.println("seperate class for implementation");
	}	
}
public class Test1 
{
	public static void main(String[] args) {
		
		A1 a1 = new A1()
		{
			@Override
			public void m1() 
			{
				System.out.println("anonymous class");
			}
		};
		a1.m1();
		A1 a = ()-> System.out.println("lambda expression");
		a.m1();
		
		A1Impl impl = new A1Impl();
		impl.m1();
	}
}