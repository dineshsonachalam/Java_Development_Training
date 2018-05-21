/*
 10.  Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
      the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result.
      If the inputs are "Hello" and "World", then the output is "HWeolrllod".
 */
import java.io.*;
import java.util.*;
public class ten 
{
	public static void main(String args[])
	{
		String a="Hello";
		String b="World";
		String c = "";
		for(int i=0;i<a.length();i++)
		{
			c += a.charAt(i);
			c += b.charAt(i);
		}
		System.out.println(c);
	}
}
/*
 Output: HWeolrllod
 */