/*
 8. Given two strings, word and a separator, return a big string made of count occurrences of the word, 
   separated by the separator string.
   if the inputs are "Wipro","X" and 3 then the output is "WiproXWiproXWipro". 
 */
public class eight 
{
	public static void main(String args[])
	{
		String s1 = "Wipro";
		String s2= "X";
		int separator = 3;
		for(int i=0;i<separator;i++)
		{
			if(i!=separator-1)
			{
				System.out.print(s1+s2);
			}
			else
			{
				System.out.print(s1);
			}
			
		}
		
	}
}
