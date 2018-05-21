/*
 12. Given a string and an int n, return a string made of n repetitions of the last n characters of the 
     string. You may assume that n is between 0 and the length of
     the string, inclusive. For example if the inputs are “Wipro” and 3, 
     then the output should be “propropro”.
 
 */
public class twelve 
{
	public static void main(String args[])
	{
		String s = "Wipro";
		int t = 3;
		int n=t;
		while(n!=0)
		{
		for(int i=t;i>=1;i--)
		{
			System.out.print(s.charAt(s.length()-i));
		}
		n--;
		}
	}
		
}
