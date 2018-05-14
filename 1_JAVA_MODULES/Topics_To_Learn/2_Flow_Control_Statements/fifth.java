 //5. Intialize a character variable in a program and if the value
 //is alphabet then print "Alphabet" if it’s a number then print "Digit" and for
 //other characters print "Special Character"
import java.io.*;
import java.util.*;
 public class fifth
 {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        char a = '9'; // Initializing a character variable
        if(Character.isLetter(a))
        {
          System.out.print("Alpahabet");
        }
        else if(Character.isDigit(a))
        {
          System.out.print("Digit");
        }
        else
        {
          System.out.print("Special Character");
        }

    }
 }

 // output 1:
 // 9
 // Digit

 // output 2:
 // b
 // Alphabet

 // output 3:
 // +
 // Special Character
