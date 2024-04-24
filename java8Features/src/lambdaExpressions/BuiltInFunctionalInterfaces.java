package lambdaExpressions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class BuiltInFunctionalInterfaces
{
	public static void main(String[] args)
	{
		Predicate<String> p = (s)->s.length()>3;
		System.out.println(p.test("suresh"));
		
		Function<String,Integer> f = (s)->s.length();
		System.out.println(f.apply("suresh"));
		
		Consumer<String> c = (s)->System.out.println(s);
		c.accept("suresh");
		
		Supplier<String> s = ()->"supplier interface";
		System.out.println(s.get());
	}
}