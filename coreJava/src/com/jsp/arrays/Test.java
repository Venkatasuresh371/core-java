package com.jsp.arrays;

public class Test 
{
	public static void m1(int i) 
	{
		i = i + 10;
	}

	public static void main(String... args)
	{
		int i= 10; 
		System.out.println(i); // line -1
		m1(i);
		System.out.println(i); // line - 2
	}
}
