// 1.  Write a program to check if a given number is Positive, Negative, or Zero.

import java.io.*;
import java.util.*;
public class one
{
  public static void main(String args[])
  {
      Scanner scan = new Scanner(System.in);
      int no = scan.nextInt();
      if(no>0)
      {
        System.out.println(no+" is positive");
      }
      else if(no==0)
      {
        System.out.println(no+" is zero");
      }
      else if(no<0)
      {
        System.out.println(no+" is negative");
      }
  }
}
// 5
// 5 is positive

// 0
// 0 is zero

// -1
// -1 is negative
