/*
 1. Write a Program that will check whether a given String is Palindrome or not
 */
public class one 
{
	public static void main(String args[])
	{
		String s = "madam";
		String reverse = "";
		for(int i=s.length()-1;i>=0;i--)
		{
			reverse+=s.charAt(i);
		}
		if(s.equals(reverse))
		{
			System.out.println(s+" is a Palindrome");
		}
		else
		{
			System.out.println(s+ " is not a Palindrome");
		}
	}
}
