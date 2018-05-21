/*
  2. Given two strings, append them together (known as "concatenation") and return the result.
  However, if the concatenation creates a double-char, then omit one of the chars.
  If the inputs are “Mark” and “Kate” then the output should be “markate”. 
  (The output should be in lowercase)
 */
import java.io.*;
import java.util.*;
public class two 
{
	public static void main(String args[])
	{
		String a = "Mark";
		String b = "Kate";
		a= a.toLowerCase();
		b=b.toLowerCase();
		String c = "";
		if(a.charAt(a.length()-1) == b.charAt(0))
		{
			c+=a;
			for(int i=1;i<b.length();i++)
			{
				c+=b.charAt(i);
			}
		}
		else
		{
			c+=a;
			c+=b;
		}
		System.out.println(c);
	}
}
