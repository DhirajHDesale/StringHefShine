/*
Write a program to find frequency of character in a string
i/p :
String s1 = "aabbcc";
o/p :
a 2
b 2
c 2
*/
public class MyClass 
{

	public static void main(String[] args) 
	{
		String s1 = "aabbcc";
		myCode(s1);
	}

	private static void myCode(String s1) 
	{
	
		char c[] = s1.toCharArray();
		int f = 0;
		for(int i = 0;i<c.length;i++) 
		{
			int k = 0;
			int temp = 0;
			for(int j = 0;j<c.length;j++){
			    if(c[i]==c[j])
			    k++;
			}
			for(int j = 0;j<i;j++) 
			{
			
				if(c[i]==c[j]) 
				{
					temp++;
				}
			}
			if(temp==0)
			System.out.println(c[i]+" "+k);
		}
	}
}
