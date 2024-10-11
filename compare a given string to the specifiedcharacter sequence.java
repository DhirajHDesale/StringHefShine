public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1="abcd";
		String s2="bacd";
		myCode(s1,s2);
	}
	private static void myCode(String s1,String s2) 
	{
		//WriteCode Here
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		for(int i = 0;i<c.length;i++) 
		{
			int k = 0;
			for(int j = 0;j<c.length;j++) 
			{
				if(c[i]==d[j] && i==j) 
				{
					k++;
				}
			}
			if(k==0) 
			{
				System.out.println("false");
				return;
			}
		}
		System.out.println("true");
	}
}
