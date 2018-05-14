 // 6.Write a program to initialize an array and print them in a sorted fashion
 // Topics: One dimensional Array

 import java.io.*;
 import java.util.*;
 public class six
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

     }
 }
