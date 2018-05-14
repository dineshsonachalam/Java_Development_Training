 // 1. Write a program to initialize an integer array and print the sum and average of the array
 // Topics: 1-D Array

 public class one
 {
    public static void main(String args[])
    {
        int[] a = {1,2,3,4,5};
        int sum = 0;
        for (int i=0;i<a.length ;i++ )
        {
            sum+=a[i];
        }
        int avg = sum/a.length;
        System.out.println("Sum: "+sum);
        System.out.println("Average: "+avg);
    }
 }

// Output:
//  Sum: 15
// Average: 3
