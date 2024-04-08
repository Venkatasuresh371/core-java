package collectrosClassTest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectorsClass 
{
	public static void main(String[] args) 
	{
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(new Student(11,"Zevin", "Computer Science", 91.2));
		studentList.add(new Student(12,"Paul", "Economics", 78.9));
		studentList.add(new Student(13,"Harish", "History", 83.7));
		studentList.add(new Student(14,"Xiano", "Literature", 71.5));
		studentList.add(new Student(15,"Soumya", "Economics", 77.5));
		studentList.add(new Student(16,"Asif", "Mathematics", 89.4));
		studentList.add(new Student(17,"Nihira", "Computer Science", 84.6));
		studentList.add(new Student(18,"Mitshu", "History", 73.5));
		studentList.add(new Student(19,"Vijay", "Mathematics", 92.8));
		studentList.add(new Student(20,"Harry", "History", 71.9));
		
		
		List<Student> list = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage)).limit(3).collect(Collectors.toList());
		System.out.println(list);
		System.out.println();
		
		Set<String> set = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
		System.out.println(set);
		System.out.println();
		
		Map<String, Double> map = studentList.stream().collect(Collectors.toMap(Student::getName,Student::getPercentage));
		System.out.println(map);
		System.out.println();
		
		LinkedList<Student> linkedList = studentList.stream().limit(2).collect(Collectors.toCollection(LinkedList::new));
		System.out.println(linkedList);
		System.out.println();
		
		String joining = studentList.stream().map(Student::getSubject).collect(Collectors.joining(","));
		System.out.println(joining);
		System.out.println();
		
		Long count = studentList.stream().collect(Collectors.counting());
		System.out.println("Count = "+count);
		System.out.println();
		
		Double maxPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.maxBy(Comparator.naturalOrder())).get();
		System.out.println("maximum Percentage = "+maxPercentage);
		System.out.println();
		
		Double minPercentage = studentList.stream().map(Student::getPercentage).collect(Collectors.minBy(Comparator.naturalOrder())).get();
		System.out.println("Minimum Percentage = "+minPercentage);
		System.out.println();
		
		Double sum = studentList.stream().collect(Collectors.summingDouble(Student::getPercentage));
		System.out.println("Sum = "+sum);
		System.out.println();
		
		Double average = studentList.stream().collect(Collectors.averagingDouble(Student::getPercentage));
		System.out.println("Average = "+average);
		System.out.println();
		
		DoubleSummaryStatistics summaryStatistics = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
		System.out.println("Sum = "+summaryStatistics.getSum());
		System.out.println("Count = "+summaryStatistics.getCount());
		System.out.println("Average = "+summaryStatistics.getAverage());
		System.out.println("maximum Percentage = "+summaryStatistics.getMax());
		System.out.println("Minimum Percentage = "+summaryStatistics.getMin());
		System.out.println();
		
		Map<String, List<Student>> grouping = studentList.stream().collect(Collectors.groupingBy(Student::getSubject));
		System.out.println(grouping);
		System.out.println();
		
		Map<Boolean, List<Student>> partition = studentList.stream().collect(Collectors.partitioningBy(s->s.getPercentage()>80));
		System.out.println(partition);
		System.out.println();
		
		List<Student> collect = studentList.stream().limit(3).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
        System.out.println(collect);
	}
}