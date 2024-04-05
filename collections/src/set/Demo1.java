package set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo1 
{
	public static void main(String[] args) 
	{
		Set<String> Colors_Set = new HashSet<String>();//it follows random order
		Colors_Set.add("Red");
		Colors_Set.add("Green");
		Colors_Set.add("Blue");
		Colors_Set.add("Cyan");
		Colors_Set.add("Magenta");
		// print set contents
		System.out.println("Hashset --->");
		System.out.println(Colors_Set);
		System.out.println("LinkedHashset --->");
		Set<String> linkedHashSet = new LinkedHashSet<String>(Colors_Set);//it follows insertion order
		System.out.println(linkedHashSet);
		System.out.println("TreeSet --->");
		Set<String> tree_Set = new TreeSet<String>(Colors_Set);//it follows sorting order
		System.out.println(tree_Set);
	}
}