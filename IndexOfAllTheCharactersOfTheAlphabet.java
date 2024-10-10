public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 ="abcd";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		for(int i = 0;i<s1.length();i++) 
		{
			System.out.println(i+" "+s1.charAt(i));
		}
	}
}
