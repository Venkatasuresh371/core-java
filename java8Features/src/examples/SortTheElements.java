package examples;

import java.util.Collections;
import java.util.List;

public class SortTheElements 
{
	public static void main(String[] args)
	{
		List<Integer> list = List.of(48,20,30,20,394,203,40);
		list.stream().sorted().forEach(System.out::println);
		System.out.println("********");
		list.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	}
}