package map;

import java.util.Hashtable;

public class Demo4
{
	public static void main(String[] args)
	{
		Hashtable<Integer, String> h = new Hashtable<Integer,String>();
		h.put(3,"lion");
		System.out.println(h.hashCode()%10);
		h.put(5,"elephant");
		System.out.println(h.hashCode()%10);
		h.put(6,"cow");
		h.put(1,"cheetah");
		h.put(4,"tiger");
		System.out.println(h);
	}
}
