package recordClass;

record Employee(int id,String name,String email,float salary) {}
public class Demo1
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(1,"suresh","suri@gmail.com",50000);
		Employee e2 = new Employee(1,"suresh","suri@gmail.com",50000);
		System.out.println(e1);
		System.out.println(e1.equals(e2));
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e1.name());
	}
}