 // 2. Write a program to initialize an integer array and find the maximum and minimum
 // value of an array
 // Topics: One dimensional Array

 public class two
 {
    public static void main(String args[])
    {
        int[] a = {10, 11, 88, 2, 12, 120};
        int max = a[0];
        int min = a[0];
        for(int i=1;i<a.length;i++)
        {
            if(max<a[i])
            {
              max = a[i];
            }
            else if(min>a[i])
            {
              min = a[i];
            }
        }
        System.out.println("MAX: "+max);
        System.out.println("MIN: "+min);
    }
 }

// Output:
// MAX: 120
// MIN: 2
