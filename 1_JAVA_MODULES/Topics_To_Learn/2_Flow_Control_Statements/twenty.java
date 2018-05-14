// 20.Write a program that displays a menu with options 1. Add 2. Sub
// Based on the options chosen, read 2 numbers and perform the relevant operation.
// After performing the operation, the program should ask the user if he wants to continue.
// If the user presses y or Y, then the program should continue displaying the menu
// else the program should terminate.
// [ Note: Use Scanner class, you can take help from the trainer regarding the same ]

import java.io.*;
import java.util.*;
public class twenty
{
    public static void main(String args[])
    {
      Scanner scan = new Scanner(System.in);
      char chosen;
        do {
          System.out.println("Enter 2 numbers:");
          int a = scan.nextInt();
          int b = scan.nextInt();
          System.out.println("Choose 1 for addition or Choose 2 for subtraction");
          int option = scan.nextInt();
          if(option==1)
          {
              System.out.println("Addition:"+(a+b));
          }
          else if(option==2)
          {
              System.out.println("Subtraction:"+(a-b));
          }
          System.out.println("Do you want to continue? Then press y or Y");
          chosen = scan.next().charAt(0);
        } while (chosen =='y' || chosen == 'Y');
    }
}
