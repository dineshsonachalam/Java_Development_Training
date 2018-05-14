// 6. Write a program to accept gender ("Male" or "Female") and
// age (1-120) from command line arguments and print the percentage of interest based
// on the given conditions.
// Interest == 8.2%
//  Gender ==> Female
//  Age    ==>1 to 58

// Interest == 7.6%
//  Gender ==> Female
//  Age    ==>59 -120


// Interest == 9.2%
//  Gender ==> Male
//  Age    ==>1-60

// Interest == 8.3%
//  Gender ==> Male
//  Age    ==>61-120
public class sixth
{
    public static void main(String args[])
    {
        String gender = args[0];
        // conversion of string to int
        int age = Integer.parseInt(args[1]);
        // == tests object references, .equals() tests the string values.
        if(gender.equals("Female"))
        {
            if(age>=1 && age<=58)
            {
                //Interest == 8.2%
                System.out.println("Interest == 8.2%");
            }
            else if(age>=59 && age<=120)
            {
                //Interest == 7.6%
                System.out.println("Interest == 7.6%");

            }
        }
        else if(gender.equals("Male"))
        {
            if(age>=1 && age<=60)
            {
                //Interest == 9.2%
                System.out.println("Interest == 9.2%");
            }
            else if (age>=61 && age<=120)
            {
                //Interest == 8.3%
                System.out.println("Interest == 8.3%");
            }
        }
    }
}

// // Output 1:
// javac sixth.java
// java sixth Male 2
// Interest == 9.2%
//
// // Output 2:
// java sixth Male 61
// Interest == 8.3%
//
// // Output 3:
// java sixth Female 30
// Interest == 8.2%
//
// // Output 4:
// java sixth Female 59
// Interest == 7.6%
