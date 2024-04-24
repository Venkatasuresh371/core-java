package list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo 
{
	public static void main(String[] args) 
	{
		LinkedList<Integer> list = new LinkedList<Integer>();
		System.out.println(list);
		list.add(30);
		list.add(50);
		list.add(60);
		list.add(10);
		list.add(90);
		System.out.println(list);
		list.addFirst(100);
		list.addLast(200);
		list.add(2,400);
		System.out.println(list);
		System.out.println(list.get(4));
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		System.out.println(	list.contains(40));
		Iterator<Integer> iterator1 = list.iterator();
		System.out.println(list);
		while (iterator1.hasNext()) 
		{
			Integer integer = iterator1.next();
			System.out.println(integer);
		}
		System.out.println();
		Iterator<Integer> iterator = list.descendingIterator();
		while (iterator.hasNext()) 
		{
			Integer integer = iterator.next();
			System.out.println(integer);
		}
	}
}