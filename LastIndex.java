/*
Example 1:

Input:
S = 00001
Output:
4
Explanation:
Last index of  1 in given string is 4.
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s="00001";
		myCode(s);
	}

	public static void myCode(String s) 
	{
		char c[] = s.toCharArray();
		int index = 0;
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]=='1')
			{
				index = i;
			}
		}
		System.out.println(index);
	}
}
