package switchStatements;

public class Demo1 {
	@SuppressWarnings("preview")
	public static void main(String[] args) 
	{
		
		int a = 10;
		int b =20;
		System.out.println(STR."\{a} + \{b} = \{a+b}");
		
		String day = "sat";
		String time = switch (day) 
				{
					case "sat", "sun" -> "6am";
					case "mon" -> "8am";
					default -> "7am";
				};
		System.out.println(time);
		
//		String time = switch (day) 
//				{
//					case "sat", "sun" :yield "6am";
//					case "mon" :yield "8am";
//					default :yield "7am";
//				};
//		System.out.println(time);
	}
}
