/*
Write a program to print after removing duplicates from a givenstring.
i/p :
String s1 = "abcdabcdabcd";
o/p :
abcd
*/

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 = "abbcfedafbcd";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		char c[] = s1.toCharArray();
		String ans = "";
		for(int i = 0;i<c.length;i++) 
		{
			int cnt = 0;
			for(int j = 0;j<i;j++) 
			{
				if(c[i]==c[j])
				cnt++;
			}
			if(cnt==0)
			ans = ans + c[i];
		}
		System.out.println(ans);
	}
}
