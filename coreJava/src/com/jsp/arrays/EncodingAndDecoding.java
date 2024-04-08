package com.jsp.arrays;

import java.util.Base64;

public class EncodingAndDecoding 
{
	public static void main(String[] args)
	{
		String s1 = "hello java";
		System.out.println("Original String :: "+s1);
		String encodedString = Base64.getEncoder().encodeToString(s1.getBytes());
		System.out.println("Encoded String :: "+encodedString);
		
		byte[] decodedBytes = Base64.getDecoder().decode(encodedString);
		String DecodedString = new String(decodedBytes);
		System.out.println("Decoded String :: "+DecodedString);
	}
}