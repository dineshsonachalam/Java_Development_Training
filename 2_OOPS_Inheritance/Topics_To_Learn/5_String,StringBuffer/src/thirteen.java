/*
 13. Given a string and a non-empty word string, return a string made of each char just 
 before and just after every appearance of the word in the string. Ignore cases where there 
 is no char before or after the word, and a char may be included twice if it is between two words.

If inputs are "abcXY123XYijk" and "XY", output should be "c13i".
If inputs are "XY123XY" and "XY", output should be "13".
If inputs are "XY1XY" and "XY", output should be "11".
 */
public class thirteen 
{
	public static void main(String args[])
	{
		String s = "abcXY123XYijk";
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='X') && ((i+1)<s.length()) && (s.charAt(i+1)=='Y'))
			{
				//left 
				if((i-1)>=0)
				{
					System.out.print(s.charAt(i-1));
				}
				//right
				if((i+2)<s.length())
				{
					System.out.print(s.charAt(i+2));
				}
			}
		}
	}
}
/*
 Input:abcXY123XYijk
 Output:c13i
 */
