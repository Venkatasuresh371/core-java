package map;

import java.util.HashMap;
import java.util.Map;

public class Demo1
{
	public static void main(String[] args)
	{
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(1,"apple");
		m.put(2,"pineapple");
		m.put(3,"mango");
		m.put(5,"gooseberry");
		m.put(7,"strawberry");
		m.put(5, "banana");
		m.put(4,"apple");
		System.out.println(m);
		m.put(null,"guava");
		System.out.println(m);
		m.put(null,null);
		System.out.println(m);
		System.out.println(m.isEmpty());
		System.out.println(m.get(2));
		m.remove(5);
		System.out.println(m);
	}
}