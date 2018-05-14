//3. Write a program to check if the program has received command line arguments or not.
//If the program has not received the values then print "No Values",
//else print all the values in a single line separated by ,(comma).
// Eg1) java Example
// O/P: No values
// Eg2) java Example Mumbai Bangalore
// O/P: Mumbai,Bangalore
// [Note: You can use length property of an array to check its length

public class third
{
    public static void main(String args[])
    {
        // checking if length of args array > 0
        if(args.length>0)
        {
          // Iterating the args array and printing the command line arguments
          for(int i=0;i<args.length;i++)
          {
              if(i+1==args.length)
              {
                  System.out.print(args[i]);
              }
              else
              {
                  System.out.print(args[i]+',');
              }
          }
        }
        else
        {
          System.out.println("No values");
        }
    }
}
// Output 1:
// javac third.java
// java third
// No values

// Output 2:
// javac third.javac
// java third mumbai bangalore chennai hyderabad
// mumbai,bangalore,chennai,hyderabad
