//13. Write a program to print prime numbers between 10 and 99.

public class thirteen
{
    public static boolean isPrime(int num)
    {
        boolean flag = false;
        for(int i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag = true;
                break;
            }
        }
        if(flag == false)
        {
            // number is a prime number
            return true;
        }
        return false;
    }


    public static void main(String args[])
    {
        for(int i=10;i<=99;i++)
        {
            if(isPrime(i)) // true
            {
                System.out.print(i+ " ");
            }
        }
    }
}
// Output:
// 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97
