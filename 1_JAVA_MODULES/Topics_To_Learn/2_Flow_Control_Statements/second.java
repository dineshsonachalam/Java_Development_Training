// 2. Write a program to check if a given number is odd or even.
import java.io.*;
import java.util.*;
public class second
{
    public static void main(String[] args)
    {
      Scanner scan = new Scanner(System.in);
      int no = scan.nextInt();
      if(no%2==0)
      {
        System.out.println(no+ " is even");
      }
      else
      {
        System.out.println(no+ " is odd");
      }
    }
}
