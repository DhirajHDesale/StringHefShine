/*
Write a Java program to concatenate a given string with itself of a given 7 number of times.
Original string: PHP

After repeating 7 times: PHPPHPPHPPHPPHPPHPPHP
*/
public class MyClass 
{
	
	public static void main(String[] args) 
	{
		String str1 = "PHP";
		myCode(str1);
	}
	
	public static void myCode(String  str1) 
	{
		String str2="";
		for(int i = 1;i<=7;i++) 
		{
			str2 = str2 + str1;
		}
		System.out.println("After repeating 7 times: "+str2);
	}
}
