/*
Write a program to find largest & smallest word in a string.
i/p :
String s1 = "welcome to hefshine soft pvt ltd";
o/p :
smallest word : to
largest word : hefshine
*/

public class MyClass 
{
	public static void main(String[] args) 
	{
		String s1 = "welcome to hefshine soft pvt ltd";
		myCode(s1);
	}
	private static void myCode(String s1) 
	{
		String arr[] = s1.split(" ");
		String smallest = arr[0];
		String largest = arr[0];
		for(int i = 0;i<arr.length;i++) 
		{
			if(arr[i].length()>largest.length()) 
			{
				largest = arr[i];
			}
		}
		for(int j = 0;j<arr.length;j++) 
		{
			if(arr[j].length()<smallest.length())
			{
				smallest = arr[j];
			}
		}
		System.out.println("smallest word : "+smallest);
		System.out.println("largest word : "+largest);	
	}
}

