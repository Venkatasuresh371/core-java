package com.jsp.loopingStatements;

public class Demo
{
	public static void main(String[] args) {
		int count = 0;
		System.out.println("Before :: "+count);
		for(int i=0;i<=10;i++)
		{
		    count = count++;
			System.out.println("in for loop :: "+count);
		}
		System.out.println("After execution :: "+count);
	}
}