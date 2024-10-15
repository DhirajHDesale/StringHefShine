/*
Write a program to sort in ascending and descending order by length of the given array of strings.
i/p :
String s1 = "welcome to hef";
o/p :
to hef welcome 
*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 = "welcome to hef";
		myCode(s1);
	}
	private static void myCode(String s1) 
	{

		String s[] = s1.split(" ");
		for(int i = 0;i<s.length;i++) 
		{
			for(int j = i+1;j<s.length;j++) 
			{
				if(s[i].length()>s[j].length())
				{
					String t = s[i];
					s[i] = s[j];
					s[j] = t;
				}
			}
		}
		String ans = "";
		for(String k:s)
		ans = ans + k + " ";
		System.out.println(ans);
	}
}
