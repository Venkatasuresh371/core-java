package methodReferences;

import java.util.function.Function;
import java.util.function.Supplier;

class Student
{
	private String name;

	public Student(String name)
	{
		super();
		this.name = name;
	}
	public Student()
	{
		super();
	}
	public String getName() 
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}
	
}

public class ConstructorReference 
{
	public static void main(String[] args)
	{
		Supplier<Student> s = Student::new;
		Student student1 = s.get();
		System.out.println(student1.getName());
		
		Function<String,Student> f= Student::new;
		Student student2 = f.apply("suresh");
		System.out.println(student2.getName());
	}
}