package com.jsp.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class ReadingDataFromConsole
{
	public static void main(String[] args) throws IOException 
	{
//		usingScanner();
		usingBufferedReader();
	}
	public static void usingScanner()
	{
		Scanner sc = new Scanner(System.in);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		list.add(sc.nextInt());
		
		System.out.println(list);
		sc.close();
	}
	public static void usingBufferedReader() throws IOException
	{
		InputStreamReader reader = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(reader);
		
		List<String> list = new ArrayList<String>();
		list.add(br.readLine());
		list.add(br.readLine());
		list.add(br.readLine());
		
		System.out.println(list);
	}
}
