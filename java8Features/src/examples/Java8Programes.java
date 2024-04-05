package examples;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8Programes
{
	public static void main(String[] args)
	{
		int[] a = {5,3,675,3,4,7,2,3,9};
		secondSmallestElement(a);
		System.out.println("*********************");
		int[] a1 = {1,2,3,4,6};
		int[] a2 = {4,5,6,7,8};
		CommonElementsBwTwoArrays(a1,a2);
		System.out.println("*********************");
		int[] array1 = {1,2,3,4,6};
		reverseAnArrayInPlace(array1);
		System.out.println("*********************");
		int[] array2 = {5,3,675,3,4,7,2,3,9};
		sortElements(array2);
		System.out.println();
		List<String> names = Arrays.asList("rohit", "urmila", "rohit", "urmila", "ram", "sham", "sita", "gita");
		wordFrequency(names);
	}
	public static void secondSmallestElement(int[] a)
	{
		int int1 = Arrays.stream(a)
				.distinct()
				.sorted()
				.skip(1)
				.findFirst().orElseThrow(()->new IllegalArgumentException("There is no second smallest element"));
		System.out.println(int1);
	}
	public static void CommonElementsBwTwoArrays(int[] a,int[] b)
	{
		List<Integer> list = Arrays.stream(a)
				.filter(n1->Arrays.stream(b).anyMatch(n2->n2==n1))
				.boxed()
				.collect(Collectors.toList());
		System.out.println(list);
	}
	public static void reverseAnArrayInPlace(int[] a)
	{
		IntStream.range(0,a.length/2).forEach(i->
		{
			int temp = a[i];
			a[i] = a[a.length-i-1];
			a[a.length-i-1] = temp;
		});
		System.out.println(Arrays.toString(a));
	}
	public static void sortElements(int[] a)
	{
		Arrays.stream(a).sorted().forEach(n->System.out.print(n+" "));
	}
	public static void wordFrequency(List<String> names) {
        Map<String, Long> frequencyWords = names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(frequencyWords);
    }
}