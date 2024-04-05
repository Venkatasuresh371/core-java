package examples;

import java.util.List;

public class FindMaxElement
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(48,20,30,20,394,203,40);
		Integer max = list.stream().max(Integer::compare).get();
		System.out.println(max);
	}
}