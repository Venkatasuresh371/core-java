package com.jsp.loopingStatements;

public class EvenAndOddNumbersInARange 
{
	public static void main(String[] args) 
	{
		System.out.println("even numbers:");
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("odd numbers:");
		for(int i=1;i<=10;i++)
		{
			if(i%2!=0)
				System.out.print(i+" ");		
		}
	}
}
