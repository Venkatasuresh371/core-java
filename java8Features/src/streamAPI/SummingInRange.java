package streamAPI;

import java.util.stream.IntStream;

public class SummingInRange
{
	public static void main(String[] args) 
	{
		int total=0;
		for(int i=1;i<=10;i++)
		{
			total+=i;
		}
		System.out.println(total);
		int sum = IntStream.rangeClosed(1,10).sum();
		System.out.println(sum);
	}

}
