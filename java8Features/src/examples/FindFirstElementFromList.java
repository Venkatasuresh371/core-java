package examples;

import java.util.List;

public class FindFirstElementFromList
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(349,20,890,103,10);
		list.stream().findFirst().ifPresent(System.out::println);
	}
}