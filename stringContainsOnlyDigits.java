/*
Write a program to test if a given string contains only digits
i/p :
String s1 ="1f23";
o/p:
not contains only digit :
i/p:
String s1 ="123";
o/p:
contains only digit
*/

public class MyClass 
{
	public static void main(String[] args) 
	{
		String s1 ="123";
		myCode(s1);
	}
	private static void myCode(String s1) 
	{
		char c[] = s1.toCharArray();
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]>='a' && c[i]<='z' || c[i]>='A' && c[i]<='Z')
			{
				System.out.println("not contains only digit");
				return;
			}
		}
			System.out.println("contains only digit");
		}
}
	
