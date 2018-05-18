// 19.Write a program to print first 5 values which are divisible by 2, 3, and 5.
// Use: While Loop
public class nineteen
{
  public static void main(String[] args) 
  {
    int counter = 0;
    int i = 1;
    // to print first 5 values divisible by 2,3,5

    while(counter<5)
    {
        if(i%2==0 && i%3==0 & i%5==0)
        {
            counter++;
            System.out.print(i+" ");
        }
        i++;
    }




  }
}

// Output
//30 60 90 120 150
