/*
 7. Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
  and otherwise return the string unchanged. If the input is "xHix", then output is "Hi".
 */
public class seven 
{
	public String remove_first_last(String s)
	{
		String temp = "";
		if(s.charAt(0)=='x')
		{
				if(s.charAt(s.length()-1)=='x')
				{
					for(int i=1;i<s.length()-1;i++)
					{
						temp += s.charAt(i);
					}
				}
				else
				{
					for(int i=1;i<s.length();i++)
					{
						temp += s.charAt(i);
					}
				}
		}
		else if(s.charAt(s.length()-1)=='x')
		{
			for(int i=0;i<s.length()-1;i++)
			{
				temp += s.charAt(i);
			}
		}
		return temp;
	}
	public static void main(String args[])
	{
		// first or last character x
		String s = "xHix";
		seven obj = new seven();
		String output = obj.remove_first_last(s);
		System.out.println(output);
		
	}
}
