package examples;

import java.util.Arrays;

public class SecondSmallesrtElement 
{
	public static void main(String[] args) 
	{
		int[] a = {4,3,5,6,3,1,1,6,7,8};
		int int1 = Arrays.stream(a).distinct().sorted().skip(1).findFirst().getAsInt();
		System.out.println(int1);
	}
}