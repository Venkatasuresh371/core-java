package com.jsp.recursionProgrames;

import java.util.Scanner;

public class FactorialDemo 
{
	public static long factorial(long n)
	{
		if(n==1) return 1;
		return n*factorial(n-1);
	}
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a number");
		long n = scn.nextLong();
		long result = factorial(n);
		System.out.println(n+"! = "+result);
		scn.close();
	}

}
