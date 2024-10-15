/*
Write a program to replace all the 'd' characters with 'f'characters.
i/p :
String s="dddaa";
o/p :
fffaa
RestrictedKeyWordsInCode: replace
	*/

public class MyClass 
{
	public static void main(String[] args) 
	{
		String s1 = "dddaa";
		char ch1='d';
		char ch2='f';
		myCode(s1,ch1,ch2);
	}

	private static void myCode(String s1,char ch1,char ch2) 
	{
		char c[] = s1.toCharArray();
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]==ch1) 
			c[i] = ch2;
		}
		System.out.println(c);
	}
}
