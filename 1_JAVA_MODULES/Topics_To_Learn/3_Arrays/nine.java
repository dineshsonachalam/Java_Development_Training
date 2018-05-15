// 9. Write a program to print the sum of the elements of the array with
// the given below condition.
// If the array has 6 and 7 in succeeding orders, ignore 6 and 7 and
// the numbers between them for the calculation of sum.

// Eg1) Array Elements - 10,3,6,1,2,7,9
// O/P: 22
// [i.e 10+3+9]
// Eg2) Array Elements - 7,1,2,3,6
// O/P:19
// Eg3) Array Elements - 1,6,4,7,9
// O/P:10

import java.io.*;
import java.util.*;
public class nine
{
    public static void main(String args[])
    {

        int[] a = {1,6,4,7,9};
        int sum = 0;
        int sum_all = 0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==6)
            {
                    sum+=a[i];
                    int count = i+1;
                    while((count<a.length)&& (a[count]!=7) )
                    {
                        sum+=a[count];
                        count++;
                    }
                    if((count<a.length) && a[count]==7)
                    {
                        sum = 0;
                    }
                    else if((count<a.length)) // adding 7
                    {
                        sum+=a[count];
                    }
                    i = count;
            }
            else
            {
                sum_all += a[i];
            }
        }
        sum_all += sum;
        System.out.println(sum_all);
    }
}
