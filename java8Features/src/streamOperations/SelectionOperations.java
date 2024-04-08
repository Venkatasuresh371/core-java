package streamOperations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SelectionOperations 
{
	public static void main(String[] args)
	{
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("David"); 
		names.add("Johnson");
		names.add("Samontika");
		names.add("Brijesh");
		names.add("John");
		
		List<String> filter = names.stream().filter(n->n.length()>5).collect(Collectors.toList());
		System.out.println(filter);
		names.stream().filter(n->n.length()>5).forEach(n->System.out.println(n));
		System.out.println();
		
		List<String> distinct = names.stream().distinct().collect(Collectors.toList());
		System.out.println(distinct);
		names.stream().distinct().forEach(n->System.out.println(n));
		System.out.println();
		
		List<String> limit = names.stream().limit(3).collect(Collectors.toList());
		System.out.println(limit);
		names.stream().limit(3).forEach(n->System.out.println(n));
		System.out.println();
		
		List<String> skip = names.stream().skip(2).collect(Collectors.toList());
		System.out.println(skip);
		names.stream().skip(2).forEach(n->System.out.println(n));
		System.out.println();
	}
}