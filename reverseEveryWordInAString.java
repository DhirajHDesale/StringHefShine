/*
Write a program to reverse every word in a string using methods.
i/p :
String s1 = "I am a good boy";
o/p :
I ma a doog yob
*/

public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 = "I am a good boy";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		
		String arr[] = s1.split(" ");
		String ans = "";
		for(int i = 0;i<arr.length;i++)
		{
			String temp = arr[i];
			char c[] = temp.toCharArray();
			int start = 0;
			int end = c.length-1;
			while(start<=end) 
			{
				char tem = c[start];
				c[start] = c[end];
				c[end] = tem;
				start++;
				end--;
			}
			String te = new String(c);
			ans = ans + te + " ";
		}
		System.out.println(ans);
	}
}
