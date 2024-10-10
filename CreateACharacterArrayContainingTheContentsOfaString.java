public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 ="aabbccd";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		char c[] = new char[s1.length()];
		for(int i = 0;i<c.length;i++) 
		{
			c[i] = s1.charAt(i);
		}
		for(char d:c)
		System.out.print(d+" ");
	}
}
