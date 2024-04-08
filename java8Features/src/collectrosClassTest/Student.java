package collectrosClassTest;

public class Student
{
	private int id;
	private String name;
	private String subject;
	private double percentage;
	
	public Student() {
		super();
	}
	public Student(int id, String name, String subject, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		this.percentage = percentage;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getPercentage() {
		return percentage;
	}
	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}
}