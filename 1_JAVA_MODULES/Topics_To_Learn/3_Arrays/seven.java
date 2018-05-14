// 7.Write a program to remove the duplicate elements in an array and print
// Eg) Array Elements--12,34,12,45,67,89
// O/P: 12,34,45,67,89
import java.io.*;
import java.util.*;
public class seven
{
    public static void main(String[] args)
    {
        int []a = {12,34,12,45,67,89};
        // first sort the array
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length-1;j++)
            {
                if(a[i]>a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Sorted Array:"+Arrays.toString(a));
        System.out.println("After removing Duplicate Elements:");
        int b = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(b!=a[i])
            {
                System.out.print(b+" ");

                b = a[i];
            }
        }
        System.out.print(b);

    }
}

// Output:
// Sorted Array:[12, 12, 34, 45, 67, 89]
// After removing Duplicate Elements:
// 12 34 45 67 89
