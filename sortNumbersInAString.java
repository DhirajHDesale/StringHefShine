public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1 = "43521";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
		char c[] = s1.toCharArray();
		for(int i = 0;i<c.length;i++) 
		{
			for(int j = i+1;j<c.length;j++) 
			{
				if(c[i]>c[j])
				{
					char t = c[i];
					c[i] = c[j];
					c[j] = t;
				}
			}
		}
		String ans = new String(c);
		System.out.println(ans);
	}
}
