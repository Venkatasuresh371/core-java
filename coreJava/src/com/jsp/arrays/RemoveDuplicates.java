package com.jsp.arrays;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{
	public static void main(String[] args) 
	{
		int[] a= {9,7,8,6,8,5,5,6,3,2};
//		Set<Integer> set = new LinkedHashSet<Integer>();
//		for (Integer i : a)
//		{
//			set.add(i);
//		}
//		set.forEach(System.out::println);
				
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
					System.out.println(a[i]);
			}
		}
	}
}