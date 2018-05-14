// 5. Write a program to find the largest 2 numbers and the smallest 2 numbers in the given array

import java.io.*;
import java.util.*;
public class five
{
    public static void main(String[] args)
    {
        int[] a = {10,9,8,7,6,5,4,3,2,1};
        // performing sorting
        int n = a.length;
        for(int i=0;i<n-1;i++)
        {
              for (int j=i+1;j<n;j++)
              {
                  if(a[i]>a[j])
                  {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                  }
              }
        }
        System.out.println("Sorted Array:"+ Arrays.toString(a));
        System.out.println("Largest 2 Numbers: "+(a[n-1])+" "+(a[n-2]));
        System.out.println("Smallest 2 Numbers: "+(a[0])+" "+(a[1]));
    }
}
