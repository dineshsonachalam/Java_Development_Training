//The command line argument is the argument passed to a program at the time when you run it.
// To access the command-line argument inside a java program is quite easy, they are stored
// as string in String array passed to the args parameter of main() method.

public class first
{
    public static void main(String args[])
    {
        String company_name = args[0];
        String company_location = args[1];
        System.out.print(company_name + " Technologies " + company_location);
    }
}

// Output:
// javac first.java
// java first WIPRO CHENNAI
// WIPRO Technologies CHENNAI
