package examples;

public class Demo1 {
	public static void main(String[] args) 
	{
		if (args.length > 0) 
		{
			System.out.println("usage: myapp");
			System.exit(1);
		}
		System.out.println("It worked ");
	}
}