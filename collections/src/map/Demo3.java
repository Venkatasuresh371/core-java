package map;

import java.util.LinkedHashMap;
import java.util.Map;

public class Demo3 
{
	public static void main(String[] args) 
	{
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		map.put(1,"suresh");
		map.put(8,"karthik");
		map.put(3,"sharan");
		map.put(6,"naga");
		System.out.println(map);
	}
}