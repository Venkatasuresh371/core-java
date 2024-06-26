package list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class User implements Comparable<User>
{
	private int id;
	private String name;
	public User(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	@Override
	public String toString() {
		return String.format("%d:%s",id,name);
	}
	@Override
	public int compareTo(User o) 
	{
		return name.compareTo(o.getName());
	}
}
public class Demo2
{
	public static void main(String[] args) 
	{
		List<User> list = new ArrayList<User>();
		list.add(new User(1,"suresh"));
		list.add(new User(2,"karthik"));
		list.add(new User(3,"sree"));
		list.add(new User(4,"venu"));
	    System.out.println(list);
		System.out.println("*******************************");
		Collections.sort(list);
		System.out.println(list);
		System.out.println("*******************************");
		Collections.sort(list,(l,r)->r.getId()-l.getId());
	    System.out.println(list);
	}
}