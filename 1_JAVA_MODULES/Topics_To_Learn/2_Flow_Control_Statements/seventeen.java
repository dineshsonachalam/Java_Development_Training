// 17. Write a program to reverse a given number and print
// Eg1)
// I/P: 1234
// O/P:4321
// Eg2)
// I/P:1004
// O/P:4001

// Use: While Loop
import java.io.*;
import java.util.*;
public class seventeen
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int length = s.length() -1;
        while(length>=0)
        {
            System.out.print(s.charAt(length));
            length--;
        }

    }
}
//I/P: 1234
// O/P:4321

// Eg2)
// I/P:1004
// O/P:4001
