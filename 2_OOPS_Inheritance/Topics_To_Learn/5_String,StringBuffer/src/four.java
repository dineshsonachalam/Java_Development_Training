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
		String duplicate = "";
		duplicate+=s.charAt(0);
		int i=1;
		while(Character.isLowerCase(s.charAt(i)) && i<s.length())
		{
			duplicate+=s.charAt(i);
			i++;
		}
		s = duplicate;
		return s;
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
