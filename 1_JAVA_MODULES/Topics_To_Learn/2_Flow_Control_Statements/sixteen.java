// 16. Write a program to print * in Floyds format (using for and while loop)
// *
// *  *
// *  *   *
//
//
//
// Example1:
//
//      C:\>java Sample
//
//      O/P Expected : Please enter an integer number
//
// Example1:
//
//      C:\>java Sample 3
//
//      O/P Expected :
//                    *
//                    *  *
//                    *  *  *

public class sixteen
{
    public static void main(String[] args)
    {
        if(args.length>0)
        {
          // converting string to integer
          int n = Integer.parseInt(args[0]);
          for(int i=0;i<n;i++)
          {
              for(int j=0;j<=i;j++)
              {
                System.out.print("* ");
              }
              System.out.println();
          }
        }
        else
        {
            System.out.println("Please enter an integer number");
        }
    }
}
// Output 1:
// javac sixteen.java
// java sixteen
// Please enter an integer number

// Output 2:
// java sixteen 3
// *
// * *
// * * *
