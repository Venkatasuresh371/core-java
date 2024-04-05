package programes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateElementsFromAList 
{
	public static void main(String[] args)
	{
		List<String> listOfStrings = Arrays.asList("Java","Python","Java","C#","Java","C#","Kotlin", "Python");
		Set<String> duplicateStrings = listOfStrings.stream()
					.filter(i->Collections.frequency(listOfStrings,i)>1)
					.collect(Collectors.toSet());
		System.out.println(duplicateStrings);
		System.out.println("************");
		List<Integer> list = Arrays.asList(30,10,40,20,10,40,10,60,90,70);
		List<Integer> collect = list.stream().filter(ele -> list.indexOf(ele)!=list.lastIndexOf(ele)).distinct().collect(Collectors.toList());
		System.out.println(collect);
	}
}