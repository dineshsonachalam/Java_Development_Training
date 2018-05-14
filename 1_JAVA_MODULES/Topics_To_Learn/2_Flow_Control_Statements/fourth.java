// 4. Initialize two character variables in a program and display the characters in alphabetical order.
// Eg1) if first character is s and second is e
// O/P: e,s
// Eg2) if first character is a and second is e
// O/P:a,e
import java.io.*;
import java.util.*;
public class fourth
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char a = scan.next().charAt(0);
        char b = scan.next().charAt(0);
        if(a<b)
        {
          System.out.print(a+","+b);
        }
        else
        {
          System.out.print(b+","+a);
        }

    }
}
// Output:
// javac fourth.java
// java fourth
// s e
// e,s
