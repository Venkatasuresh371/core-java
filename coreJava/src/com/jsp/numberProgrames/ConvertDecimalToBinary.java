package com.jsp.numberProgrames;

import java.util.Arrays;

public class ConvertDecimalToBinary 
{
	public static void main(String[] args) 
	{
		decimalToBinary1(343);
		decimalToBinary2(15);
	}

	public static void decimalToBinary1(int decNum) 
	{
		long pos = 1, binNum = 0;
		while (decNum > 0) {
			int b = decNum % 2;
			binNum = (b * pos) + binNum;
			decNum = decNum / 2;
			pos = pos * 10;
		}
		System.out.println("the binary number ---> " + binNum);
	}

	public static void decimalToBinary2(int decNum) 
	{
		int bin[] = new int[31];
		int i = 0;
		while (decNum > 0) {
			bin[i] = decNum % 2; 
			i++; 
			decNum = decNum / 2; 
		}
		System.out.println(Arrays.toString(bin));
		System.out.print("the binary number ---> ");
		for (int j = i-1 ; j >= 0; j--) {
			System.out.print(bin[j]);
		}
	}
}
