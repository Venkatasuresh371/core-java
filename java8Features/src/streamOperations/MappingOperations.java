package streamOperations;

import java.util.ArrayList;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MappingOperations
{
	public static void main(String[] args) 
	{
		ArrayList<String> names = new ArrayList<String>();

		names.add("David");
		names.add("Johnson12");
		names.add("Samontika87");
		names.add("Brijesh");
		names.add("John");
		
		Map<Integer, String> map = names.stream().distinct().collect(Collectors.toMap(String::length,Function.identity()));
		System.out.println(map);
		System.out.println();
		names.stream().flatMap(s->Stream.of(s.charAt(3))).forEach(System.out::println);
	}

}
