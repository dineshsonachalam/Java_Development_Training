// 8. Write a program to print the element of an array that
// has occurred the highest number of times
// Eg) Array -> 10,20,10,30,40,100,99
// O/P:10
// Topics : 1 dimensional array

import java.io.*;
import java.util.*;
public class eight
{
    //  or void sort(int[] a)
    public static int[] sort(int[] a)
    {
        for(int i=0;i<a.length-1;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]>a[j])
                {
                  int temp = a[i];
                  a[i] = a[j];
                  a[j] = temp;
                }
            }
        }
        return a;

    }
    public static void main(String args[])
    {
        int[] a = {1,1,2,2,2,3,3,3,3};
        // Creating object of class eight
        eight obj = new eight();
        a = obj.sort(a);
        System.out.println("Sorted Array:"+Arrays.toString(a));

        // now comparing the adjacent element
        int max_occured_number=0;
        int counter_max_occured_number = 0;
        int counter = 1;
        for(int i=0;i<a.length-1;i++)
        {
            if(a[i]==a[i+1])
            {
               counter++;
            }

            if((a[i]!=a[i+1]) || (i==a.length-2))
            {
              if(counter>counter_max_occured_number)
              {
                counter_max_occured_number = counter;
                max_occured_number = a[i];
              }
              counter = 1;
            }
        }
        System.out.println("max_occured_number:"+max_occured_number);
        //System.out.println("counter_max_occured_number:"+counter_max_occured_number);

    }
}


//Input 1: 10,20,10,30,40,100,99
//Output 1:
// Sorted Array:[10, 10, 20, 30, 40, 99, 100]
// max_occured_number:10

//Input 2: 1,1,2,2,2,3,3,3,3
// Sorted Array:[1, 1, 2, 2, 2, 3, 3, 3, 3]
// max_occured_number:3
