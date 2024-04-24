package streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Institute
{
	private String name;
	private List<String> areas;
	public Institute(String name, List<String> areas) {
		super();
		this.name = name;
		this.areas = areas;
	}
	public String getName() {
		return name;
	}
	public List<String> getAreas() {
		return areas;
	}
}
public class MapMethod 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Suresh","Karthik","Harsha","Sai","venu");
		
		list.stream().map(String::toUpperCase).forEach(System.out::println);
		System.out.println();
		
		List<String> collect = list.stream().map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(collect);
		System.out.println();
		
		list.stream().map(e->e.toLowerCase()).forEach(System.out::println);
		System.out.println();
		
		List<Integer> collect2 = list.stream().map(e->e.length()).collect(Collectors.toList());
		System.out.println(collect2);
		System.out.println();
		
		List<Institute> instituteList = new ArrayList<>();
        
		instituteList.add(new Institute("IIM", Arrays.asList("Bangalore", "Ahmedabad", "Kozhikode", "Lucknow")));
		instituteList.add(new Institute("IIT", Arrays.asList("Delhi", "Mumbai", "Kharagpur")));
		instituteList.add(new Institute("NIFT", Arrays.asList("Hyderabad", "Mumbai", "Patna", "Bangalore")));
		
		List<String> map = instituteList.stream().map((institute)->institute.getName()).collect(Collectors.toList());
		 List<String> flatMap = instituteList.stream().flatMap((institute)->institute.getAreas().stream()).collect(Collectors.toList());
		System.out.println(map);
		System.out.println();
		System.out.println(flatMap);
	}
}