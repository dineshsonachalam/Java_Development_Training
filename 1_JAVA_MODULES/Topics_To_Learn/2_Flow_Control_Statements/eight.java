// 8. Write a program to print the color name, based on color code. If color code in
// not valid then print "Invalid Code". R->Red, B->Blue, G->Green, O->Orange, Y->Yellow, W->White.

// Use: Switch statement

import java.io.*;
import java.util.*;
public class eight
{
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      char color_code = scan.next().charAt(0);
      switch(color_code)
      {
          case 'R':
            System.out.println("Red");
            break;
          case 'B':
            System.out.println("Blue");
            break;
          case 'G':
            System.out.println("Green");
            break;
          case 'O':
            System.out.println("Orange");
            break;
          case 'Y':
            System.out.println("Yellow");
            break;
          case 'W':
            System.out.println("White");
            break;
          default:
            System.out.println("Invalid Code");
      }
    }
}
// Input: W
// Output: White
