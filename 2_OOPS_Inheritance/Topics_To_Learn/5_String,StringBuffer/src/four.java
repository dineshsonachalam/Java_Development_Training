/*
 4.Given a string of even length, return the first half.
  So the string "CatDog" yields "Cat". If the string length is odd number then return null.
 */
import java.io.*;
import java.util.*;
public class four 
{
	public String first_half(String s)
	{
		if(s.length()%2==0)
		{
		String duplicate = "";
		duplicate+=s.charAt(0);
		int i=1;
		while(i<s.length() && Character.isLowerCase(s.charAt(i)))
		{
			duplicate+=s.charAt(i);
			i++;
		}
		s = duplicate;
		return s;
		}
		else
		{
		 return "null";
		}
	}
	
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		four obj = new four();
		String output = obj.first_half(s);
		System.out.println(output);
	}
}
/*
 Output:
 CatDog

 */
