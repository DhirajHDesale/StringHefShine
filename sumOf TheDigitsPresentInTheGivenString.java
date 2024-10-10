public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s1="a2ba1ca3d";
		myCode(s1);
	}
	
	private static void myCode(String s1) 
	{
		char c[] = s1.toCharArray();
		int sum = 0;
		for(int i = 0;i<c.length;i++) 
		{
			if(c[i]>='0' && c[i]<='9')
			sum = sum + c[i]-'0';
		}
		System.out.println(sum);
	}
}
