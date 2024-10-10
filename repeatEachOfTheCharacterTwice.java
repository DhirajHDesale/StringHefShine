public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 = "welcome";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		for(int i = 0;i<s1.length();i++) 
		{
			for(int j = 1;j<=2;j++)
			{
				System.out.print(s1.charAt(i));
			}
		}
	}
}
