// Write a Java program to find if the given number is palindrome or not
//
// Example1:
//
//      C:\>java Sample 110011
//
//      O/P Expected : 110011 is a palindrome
//
// Example2:
//
//      C:\>java Sample 1234
//
//      O/P Expected : 1234 is not a palindrome

// Use: While Loop

public class eighteen
{
    public static void main(String[] args)
    {
        // Converting a string to an integer
        int n  = Integer.parseInt(args[0]);
        int l = args[0].length();
        int temp = n;
        int r,sum = 0;
        while(n>0)
        {
            r = n % 10;
            sum = (sum*10) + r;
            n = n/10;
        }
        if(temp==sum)
        {
            System.out.println(temp+ " is a planidrome");
        }
        else {
          System.out.println(temp+ " is not a planidrome");
        }

    }
}
// Output 1: java eighteen 110011
// Its a palindrome

// Output 2: 1234
//Its not a planidrome
