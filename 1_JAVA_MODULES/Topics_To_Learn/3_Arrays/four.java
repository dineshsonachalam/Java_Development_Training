 // 4. Initialize an integer array with ascii values and print
 // the corresponding character values in a single row.

// Topics: 1 Dimensional array

import java.io.*;
import java.util.*;
public class four
{
    // ascii values a -> 97 to z->122
    // ascii values A -> 65 to Z->90
    public static void main(String[] args)
    {
      int[] a = {65,66,67,68,69,70}; //Initialize array with ascii values
      for (int i=0;i<a.length;i++)
      {
          // Type conversion of integers to characters
          System.out.print((char)(a[i])+" ");
      }
    }
}

// Output:

//javac four.java
//
// java four
// A B C D E F
