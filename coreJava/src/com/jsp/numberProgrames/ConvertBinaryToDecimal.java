package com.jsp.numberProgrames;

public class ConvertBinaryToDecimal
{
	public static void main(String[] args)
	{
		binaryToDecimal1(01100000);
		binaryToDecimal2(01100000);
	}
	public static void binaryToDecimal1(long binNum)
	{
		int i=1;
	    long decNum=0;
	    long sum=0;
	    while(binNum>0)
	    {
	    	decNum =(binNum%10)*i;
	    	binNum=binNum/10;
	    	i=i*2;
	    	sum= (sum+decNum);
	    }
		System.out.println("decimal number ---> "+sum);
	}
	public static void binaryToDecimal2(long binNum)
	{
		long dec = 0;  
		int n = 0;  
		while(true)
		{  
			if(binNum == 0)
			{  
				break;  
			}
			else 
			{  
				long t = binNum % 10;  
				dec += t * (Math.pow(2, n));  
				binNum = binNum/10;  
				n++;  
			}  
		}  
		System.out.println("decimal number ---> "+dec);
	}
}