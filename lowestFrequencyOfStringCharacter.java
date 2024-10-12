/*
Write a program to get lowest frequency of a character in a string.
i/p :
String s1 = "weLcome";
o/p :
1
w
*/

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 = "weLcome";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		char c[] = s1.toCharArray();
		int low = Integer.MAX_VALUE;
		char temp = 'd';
		for(int i = 0;i<c.length;i++) 
		{
			int d = 0;
			for(int j = 0;j<c.length;j++) 
			{
				if(c[i]==c[j])
				{
					d++;

				}
			}
			if(d<low) 
			{
				low = d;
				temp = c[i];
				
			}
		}
		System.out.println(low);
		System.out.println(temp);
	}
}

