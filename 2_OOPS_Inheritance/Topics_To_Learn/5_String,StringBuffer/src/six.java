/*
 6.Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string on
  the outside and the longer string on the inside. The strings will not be the same length, 
 but they may be empty (length 0). If input is "hi" and "hello", then output will be "hihellohi".
 */
public class six 
{
	public String transform(String a,String b)
	{
		String short_word = "";
		String long_word = "";
		if(a.length()>=b.length())
		{
			long_word+=a;
			short_word+=b;
		}
		String op = (short_word+long_word+short_word);
		System.out.println(short_word);
		return op;
	}
	public static void main(String args[])
	{
		String a = "hi";
		String b = "hello";
		six  obj = new six();
		String op = obj.transform(a,b);
		System.out.println(op.length());
		System.out.println("Hello world");
	}
}
