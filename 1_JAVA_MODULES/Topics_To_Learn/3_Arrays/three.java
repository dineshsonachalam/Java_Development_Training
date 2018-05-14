// 3. Write a program to initialize an integer array with values and check if a given
// number is present in the array or not. If the number is not found,
// it will print -1 else it will print the index value of the given  number in the array
// Ex1) Array elements are  {1,4,34,56,7} and the search element is 90
// O/P: -1
// Ex2)Array elements are  {1,4,34,56,7} and the search element is 56
// O/P: 4

// Topics: One dimensional Array

public class three
{
    public static void main(String args[])
    {
        int[] a = {1,4,34,56,7};
        int search_no = 90;
        boolean flag = true;
        for (int i=0;i<a.length ;i++ )
        {
            if(search_no==a[i])
            {
                System.out.println("INDEX: "+(i+1));
                flag = false;
                break;
            }
        }
        if(flag == true)
        {
            System.out.println("-1");
        }
    }
}
// INPUT 1: 56
// Output 1 :
// java three
// INDEX: 4

// INPUT 2: 90
// Output 2:
// java three
// -1
