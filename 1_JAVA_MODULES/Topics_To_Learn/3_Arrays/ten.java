// 10. Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments.
//
// Example1:
//
//      C:\>java Sample 1 2 3
//
//      O/P Expected : Please enter 4 integer numbers
//
// Example2:
//
//      C:\>java Sample 1 2 3 4
//
//      O/P Expected :
//
//   The given array is :
//   1 2
//   3 4
//   The reverse of the array is :
//   4 3
//   2 1
//
// 1       2         3       4
// 5       6         7       8
// 9       10       11      12
// Topics: multi dimensional array && Command Line arguments

public class ten
{
    public static void main(String args[])
    {
        if(args.length==4)
        {
          int  counter = 0;
          int[][] a = new int[2][2];
          System.out.println(args.length);
          for(int i=0;i<2;i++)
          {
              for(int j=0;j<2;j++)
              {
                  a[i][j] = Integer.parseInt(args[counter]);
                  counter++;
              }
          }
          System.out.println("The given array is:");
          for(int i=0;i<2;i++)
          {
              for(int j=0;j<2;j++)
              {
                  System.out.print(a[i][j]+" ");
              }
              System.out.println();
          }
          System.out.println("The Reverse of the given array is:");
          for(int i=1;i>=0;i--)
          {
              for(int j=1;j>=0;j--)
              {
                  System.out.print(a[i][j]+" ");
              }
              System.out.println();
          }

        }
        else
        {
            System.out.println("Please enter 4 integer numbers");
        }
    }
}
