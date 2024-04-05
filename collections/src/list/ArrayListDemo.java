package list;

import java.util.ArrayList;

public class ArrayListDemo
{
	public static void main(String[] args) 
	{
		ArrayList<String> fruits = new ArrayList<String>();
		System.out.println(fruits);
		fruits.add("banana");
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("guava");
		fruits.add("grapes");
		System.out.println(fruits);
		fruits.add(2,"orange");
		System.out.println(fruits);
		System.out.println(fruits.contains("banana"));
		System.out.println(fruits.get(3));
		System.out.println("index : "+fruits.indexOf("orange"));
		fruits.set(3,"mosambi");
		System.out.println(fruits);
		System.out.println(fruits.size());
		fruits.removeAll(fruits);
		System.out.println(fruits);
	}
}