/*
 5.Given a string, return a version without 
 the first and last char, so "Wipro" yields "ipr". The string length will be at least 2. 
 */
import java.io.*;
import java.util.*;
public class five 
{
	public String remove(String s)
	{
		String duplicate = "";
		for(int i=1;i<s.length()-1;i++)
		{
			duplicate += s.charAt(i);
		}
		if(duplicate.length()>=2)
		{
			return duplicate;
		}
		return "not possible";
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		five obj = new five();
		String op = obj.remove(s);
		System.out.println("Output:"+op);
	}
}
/*
 
 Wipro
 Output:ipr
 */
