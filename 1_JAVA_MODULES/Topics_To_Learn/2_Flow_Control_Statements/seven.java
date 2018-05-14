// 7. Write a program to convert from upper case to lower case and vice versa of an
// alphabet and print the old character and new character as shown in example (Ex: a->A, M->m).
public class seven
{
    public static void main(String args[])
    {
        char a = 'B';
        // checking whether variable is a small letter
        if(a>=97 && a<=122)
        {
            System.out.print((char)(a-32));
        }
        else if(a>=65 && a<=90) // checking whether variable is a capital letter
        {
            System.out.println((char)(a+32));
        }
    }
}
// Input 1: a
// Output 1: A

// Input 2: B
// Output 2: b
