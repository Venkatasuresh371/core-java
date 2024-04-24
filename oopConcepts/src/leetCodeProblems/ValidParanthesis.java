package leetCodeProblems;

import java.util.Stack;

public class ValidParanthesis
{
	public static void main(String[] args) 
	{
		String s = "()";
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s)
	{
		Stack<Character> leftSymbols = new Stack<>();
		for (char c : s.toCharArray())
		{
			// If left symbol is encountered
			if (c == '(' || c == '{' || c == '[') 
			{
				leftSymbols.push(c);
			}
			// If right symbol is encountered
			else if (c == ')' && !leftSymbols.isEmpty() && leftSymbols.peek() == '(')
			{
				leftSymbols.pop();				
			} 
			else if (c == '}' && !leftSymbols.isEmpty() && leftSymbols.peek() == '{')
			{
				leftSymbols.pop();
			} 
			else if (c == ']' && !leftSymbols.isEmpty() && leftSymbols.peek() == '[') 
			{
				leftSymbols.pop();
			}
			// If none of the valid symbols is encountered
			else 
			{
				return false;
			}
			System.out.println(leftSymbols);
		}
		return leftSymbols.isEmpty();
	}
}