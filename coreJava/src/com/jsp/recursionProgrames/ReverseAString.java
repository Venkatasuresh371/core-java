package com.jsp.recursionProgrames;

import java.util.Scanner;

public class ReverseAString 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter a string");
		String str = scn.nextLine();
		String rev = reverseString(str);
		System.out.println("Reversed string is --->  "+rev);
		System.out.println(str.substring(1));
		System.out.println(str.charAt(0));
		scn.close();
	}
	public static String reverseString(String str) 
	{
		if(str.isEmpty())     
			return str;
		return reverseString(str.substring(1))+str.charAt(0);
		
	}
}
