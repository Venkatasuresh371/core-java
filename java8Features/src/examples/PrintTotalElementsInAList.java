package examples;

import java.util.List;

public class PrintTotalElementsInAList 
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(48,20,30,20,394,203,40);
		long count = list.stream().count();
		System.out.println(count);
	}
}