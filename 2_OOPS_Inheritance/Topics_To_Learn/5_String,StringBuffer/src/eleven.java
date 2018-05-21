/*
 11. Given two strings, a and b, create a bigger string made of the first char of a, 
 the first char of b, the second char of a, the second char of b, and so on. Any leftover chars go at 
 the end of the result. If input is “abc” and “xyz”, then output should be “axbycz”.
 */
import java.io.*;
import java.util.*;
public class eleven 
{
	public static void main(String args[])
	{
		String a="abc";
		String b="xyz";
		String c = "";
		for(int i=0;i<a.length();i++)
		{
			c += a.charAt(i);
			c += b.charAt(i);
		}
		System.out.println(c);
	}
}
