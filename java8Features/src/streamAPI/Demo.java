package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo
{
	public static void main(String[] args)
	{
		List<Student> slist = new ArrayList<>();
		slist.add(new Student(1,"suresh","mech"));
		slist.add(new Student(2,"karthik","cse"));
		slist.add(new Student(3,"harsha","ece"));
		slist.add(new Student(4,"sai","eee"));
		slist.add(new Student(5,"venu","civil"));
		
		Student student = slist.stream().sorted(Comparator.comparing(Student::getId).reversed()).findFirst().get();
		System.out.println(student);
		
		Student student2 = slist.stream().collect(Collectors.maxBy(Comparator.comparing(Student::getId))).get();
		System.out.println(student2);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Your Choice");
		int Choice = scanner.nextInt();
		switch (Choice)
		{
		case 1:
			slist.stream().filter(e->
			{
				return e.getName().startsWith("s");
			}).forEach(System.out::println);
			break;
		case 2:
			slist.stream().map(e->e.getName().toUpperCase()).forEach(System.out::println);;
			break;
		}
		scanner.close();	
	}
}