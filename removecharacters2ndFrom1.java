/*
remove characters from the first String which are present in the second String
i/p : s1=abcd   s2=ab
o/p : cd
*/

public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="ab";
		myCode(s1,s2);
	}

	private static void myCode(String s1,String s2) 
	{
		
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		String ans = "";
		for(int i = 0;i<c.length;i++) 
		{
			int k = 0;
			for(int j = 0;j<d.length;j++) 
			{
				if(c[i]==d[j]) 
				k++;
			}
			if(k==0)
			ans = ans + c[i];
		}
		System.out.println(ans);
	}
}
