package leetCodeProblems;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumFromAnArray 
{
	public static void main(String[] args)
	{
		int[] a = {3,4,2,5,6};
		int target = 8;
		int[] twoSum = twoSum(a, target);
		System.out.println(Arrays.toString(twoSum));
		int[] b = {7,4,6,7,8,2};
		int target1 = 12;
		int[] twoSum1 = twoSum1(b, target1);
		System.out.println(Arrays.toString(twoSum1));
	}
	
	public static int[] twoSum(int[] a,int target)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int i = 0; i < a.length; i++) 
		{
			int req_num = target-a[i];
			if(map.containsKey(req_num))
			{
				int[] arr = {map.get(req_num),i};
				return arr;
			}
			map.put(a[i],i);
		}
		return null;
	}
	public static int[] twoSum1(int[] a,int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
					return new int[]{i,j};
			}
		}
		return null;
	}
}
