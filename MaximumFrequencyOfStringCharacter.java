public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 = "abcaabcb";
		myCode(s1);
	}
	
	private static void myCode(String s1) 
	{

		char c[] = s1.toCharArray();
		int max = 0;
		char temp = c[0];
		for(int i = 0;i<c.length;i++) 
		{
			int k = 0;
			for(int j = 0;j<c.length;j++) 
			{
				if(c[i]==c[j])
				{
					k++;
				}
			}
			if(k>max) 
			{
				max = k;
				temp = c[i];
			}
		}
		System.out.println(max);
		System.out.println(temp);
	}
}
