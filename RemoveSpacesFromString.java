/*
iven a string, remove spaces from it. 

Example 1:
Input:
S = "hef shi ne"
Output: hefshine
Explanation: All the spaces have been 
removed.
Example 2:

Input: 
S = "    h e f"
Output: hef
Explanation: All the spaces including
the leading ones have been removed.
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String s="  welcome to hefshine";
		myCode(s);
	}

	public static void myCode(String s) 
	{
		
		String arr[] = s.split(" ");
		String ans="";
		for(int i = 0;i<arr.length;i++)
		{
			ans = ans +arr[i];
		}
		System.out.println(ans);
	}
}
