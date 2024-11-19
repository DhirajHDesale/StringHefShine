/*
Pattern of Strings 
Given a string S of length N, find the pattern of the strings as shown below in the examples.
Example 1:
Input: S = "hello"

Output: 
hello
hell
hel
he
h
  */
public class MyClass 
{
	public static void main(String[] args) 
	{
		myCode("Hello");
	}
	public static void myCode(String string) 
	{
		int length = string.length();
		for(int i = 0;i<string.length();i++)
		{
			for(int j = 0;j<length;j++)
			{
				System.out.print(string.charAt(j));
			}
			length--;
			System.out.println();
		}
	}
}
