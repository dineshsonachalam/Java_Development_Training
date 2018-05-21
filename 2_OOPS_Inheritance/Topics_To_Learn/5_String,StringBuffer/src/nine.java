/*
 9. Return a version of the given string, where for every star (*) in the string 
 the star and the chars immediately to its left and right are gone. So "ab*cd" yields "ad" 
 and "ab**cd" also yields "ad"
 */
public class nine 
{
	public static void main(String args[])
	{
		// char left and right
		String s ="ab******cd";
		String index = "";
		StringBuilder str = new StringBuilder(s); 
		for(int i=0;i<s.length();i++)
		{
			// Deleting left element
			if( ((i-1)>=0) && str.charAt(i)=='*' && str.charAt(i-1)!='*')
			{
				index+=(i-1);
				index+="_";
			}
			// Deleting right element
			if( ((i+1)!=s.length()) && str.charAt(i)=='*' && str.charAt(i+1)!='*')
			{
				index+=(i+1);
				index+="_";
			}
		}		
		//System.out.println(index);
		int l = index.length();
		int counter = 0;
		for(int i=0;i<l;i++)
		{
			if(Character.isDigit(index.charAt(i)))
			{
				char a = index.charAt(i);
				String temp = "";
				temp+=a;
				int no = Integer.parseInt(temp)-counter;
				//System.out.println(no);
			    str.deleteCharAt(no);
			    l--;
			    counter++;
			}
			
			
		}
		String temp2 = str.toString();
		String output = "";
		for(int i=0;i<temp2.length();i++)
		{
			if(temp2.charAt(i)!='*')
			{
				output+=temp2.charAt(i);
			}
		}
		System.out.println(output);
		
	}
}
