package queue;

import java.util.PriorityQueue;

public class PriorityQueueDemo
{
	public static void main(String[] args) 
	{
		PriorityQueue<String> queue = new PriorityQueue<String>();
		System.out.println(queue);
		queue.add("suresh");
		queue.add("karthik");
		queue.add("venu");
		queue.add("vamsi");
		System.out.println(queue);
		queue.contains("hari");
		queue.offer("harini");
		queue.offer("abhi");
		queue.offer("sree");
		System.out.println(queue);
	}
}