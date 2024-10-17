/*
Write a program to get the character at the given index within theString.
i/p :
String s1 ="abcd";
int index=3;
o/p :
d
---------------------
i/p :
String s1 ="abcd";
int index=5;
o/p :
out of range index
RestrictedKeyWordsInCode: charAt
	*/
public class MyClass 
{
	public static void main(String[] args) 
	{
		String s1 ="abcd";
		int index=3;
		myCode(s1,index);
	}
	private static void myCode(String s1,int index) 
	{
		char c[] = s1.toCharArray();
		for(int i = 0;i<c.length;i++) 
		{
			if(i==index)
			{
				System.out.println(c[i]);
				return;
			}
		}
		System.out.println("out of range index");
	}
}
