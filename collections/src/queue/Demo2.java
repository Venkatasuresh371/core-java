package queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Demo2
{
	public static void main(String[] args) 
	{
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("suresh");
		deque.add("karthik");
		deque.add("venu");
		deque.add("sree");
		deque.add("sharan");
		System.out.println(deque);
		deque.addFirst("vamsi");
		deque.addLast("nag");
		System.out.println(deque);
		System.out.println(deque.contains("sree"));
		System.out.println(deque.element());
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
		System.out.println(deque.peek());
		System.out.println(deque.poll());
		System.out.println(deque);
	}
}