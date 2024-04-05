package queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Queue<Integer> queue = new PriorityQueue<Integer>();
		queue.add(40);
		queue.add(90);
		queue.add(10);
		queue.add(30);
		queue.add(80);
		System.out.println(queue);
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue);
		queue.offer(70);
		System.out.println(queue);
	}
}