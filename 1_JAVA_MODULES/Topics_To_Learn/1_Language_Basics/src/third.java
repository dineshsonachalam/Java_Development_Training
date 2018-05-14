import java.io.*;
import java.util.*;
public class third
{
    public static void main(String args[])
    {
        // converting string to int
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        System.out.print("Sum of "+ a + " and "+ b + " is "+(a+b));
    }
}

// Output:
// javac third.java
// java third 10 20
// Sum of 10 and 20 is 30
