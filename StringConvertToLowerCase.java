/*
Write a program to convert all the characters in a string tolowercase.
i/p :
String s1 = "WELCOME";
o/p :
welcome



RestrictedKeyWordsInCode: toLowerCase
	*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 = "WELCOME";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		char c[]  = s1.toCharArray();
		String ans = "";
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]>='A' && c[i]<='Z')
			ans = ans + (char)(c[i]+32);
		}
		System.out.println(ans);
	}
}
