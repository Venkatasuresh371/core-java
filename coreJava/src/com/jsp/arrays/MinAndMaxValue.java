package com.jsp.arrays;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MinAndMaxValue
{
	public static void main(String[] args)
	{
		int[] a = {5,2,4,6,22,3,3,5,7,9};
		System.out.println(Arrays.toString(a));
		diff(a);
	}
	public static void diff(int[] a)
	{
		System.out.println(Arrays.stream(a).max().getAsInt());
		IntStream.rangeClosed(1,10).boxed().forEach(System.out::println);
	}
}