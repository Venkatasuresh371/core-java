package map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class Demo2 
{
	public static void main(String[] args) 
	{
		SortedMap<String,String> treeMap = new TreeMap<String,String>();
		treeMap.put("suresh","paleti");
		treeMap.put("karthik","paleti");
		treeMap.put("venu","kuruba");
		treeMap.put("sree","thandra");
		treeMap.put("rith","v");
		System.out.println(treeMap);
		System.out.println(treeMap.get("rith"));
		System.out.println(treeMap.firstKey());
		System.out.println(treeMap.lastKey());		
		System.out.println("**********");
		for (String string : treeMap.values()) 
		{
			System.out.println(string);
		}
		System.out.println("************");
		for (String string : treeMap.keySet()) 
		{
			System.out.println(string);
		}
		System.out.println("**********");
		for (Map.Entry<String,String> s:treeMap.entrySet()) 
		{
			System.out.println(s);
		}
	}
}