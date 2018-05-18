// 15. Write a program to add all the values in a given number and print. Ex: 1234->10
// Use: For Loop
import java.io.*;
import java.util.*;
public class fifteen
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        /*
        String s = scan.next();
        for(int i=0;i<s.length();i++)
        {
            // convert character to integer
            sum+= Character.getNumericValue(s.charAt(i));
        }
        System.out.println("Sum:"+sum);
        */
        int n = scan.nextInt();
        while(n>0)
        {
            sum += n%10;
            n = n/10;
        }
        System.out.println(sum);

    }
}
// Input: 1234
// Output: 10
