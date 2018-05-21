/*
 3. Given a string, return a new string made of n copies of the first 2 chars of the original 
    string where n is the length of the string. The string may be any length. If there are fewer than 
    2 chars, use whatever is there.
    If input is "Wipro" then output should be "WiWiWiWiWi".
 */
import java.io.*;
import java.util.Scanner;
public class three 
{
	public String n_copies(String s)
	{
		int l = s.length();
		String temp = "";
		for(int i=0;i<2;i++)
		{
			temp += s.charAt(i);
		}
		String o = "";
		for(int i=0;i<s.length();i++)
		{
			o+=temp;
		}
		return o;
	}
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		three obj = new three();
		String output = obj.n_copies(s);
		System.out.println(output);
	}
}
/*
 Output:
 wipro
 wiwiwiwiwi
 */
