package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo3 
{
	public static void main(String[] args)
	{
		List<String> fruits = new ArrayList<String>();
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("guava");
		fruits.add("grapes");
		System.out.println("Array List ::");
		System.out.println(fruits);
		
		List<String> linkedList = new LinkedList<String>(fruits);
		System.out.println("Linked List ::");
		System.out.println(linkedList);
		
		List<String> vector = new Vector<String>(fruits);
		System.out.println("Vector ::");
		System.out.println(vector);
	}
}