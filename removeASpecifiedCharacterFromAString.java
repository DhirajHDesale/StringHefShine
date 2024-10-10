public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1="Aabcd";
		char ch='a';
		myCode(s1,ch);
	}

	private static void myCode(String s1,char ch) 
	{
		char c[] = s1.toCharArray();
		String ans = "";
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]!=ch)
			ans = ans + c[i];
		}
		System.out.println(ans);
	}
}
