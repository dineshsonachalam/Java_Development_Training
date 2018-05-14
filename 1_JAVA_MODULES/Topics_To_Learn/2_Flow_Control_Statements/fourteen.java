// 14. Write a Java program to find if the given number is prime or not.

// Prime no : no which is only divisible by 1 and itself.
import java.io.*;
import java.util.*;
public class fourteen
{
  public static void main(String[] args)
  {


      if(args.length>0)
      {
            int number = Integer.parseInt(args[0]);
            boolean flag = false;
            if(number!=1 && number!=0)
            {

                  for(int i=2;i<=number/2;i++)
                  {
                      // condition for non prime numbers
                      if(number%i==0)
                      {
                          flag = true;
                          break;
                      }
                  }
                  if(flag == false) //prime no
                  {
                      System.out.println(number+" is a prime number");
                  }
                  else
                  {
                      System.out.println(number+" is not a prime number");
                  }
              }
              else if(number==1)
              {
                  System.out.println("1 is neither prime nor composite");
              }
              else if(number == 0)
              {
                  System.out.println("0 is neither prime nor composite");
              }
      }
      else
      {
          System.out.println("Please enter an integer number");
      }

  }
}
// Output 1:
// javac fourteen.java
// java fourteen
// Please enter an integer number

// Output 2:
// java fourteen 1
// 1 is neither prime nor composite

// Output 3:
// java fourteen 0
// 0 is neither prime nor composite
//
// Output 4:
// java fourteen 10
// 10 is not a prime number
//
// Output 5:
// java fourteen 7
// 7 is a prime number
