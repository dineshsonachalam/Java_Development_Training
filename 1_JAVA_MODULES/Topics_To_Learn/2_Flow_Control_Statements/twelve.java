// 12 Write a program to check if a given number is prime or not
// Use: For Loop

// Prime no : no which is only divisible by 1 and itself.
import java.io.*;
import java.util.*;
public class twelve
{
  public static void main(String[] args)
  {
      Scanner scan = new Scanner(System.in);
      int number = scan.nextInt();
      boolean flag = false;
      // We only need to loop through half of the number, because
      // no  number is divisible by more than its half
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
}
// Output:
// java twelve
// 7
// 7 is a prime number
