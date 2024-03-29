/*
2. Create a new class called “Calculator” which contains the following: 
1. A static method called powerInt(int num1,int num2) that accepts two integers and returns 
  num1 to the power of num2 (num1 power num2). 
2. A static method called powerDouble(double num1,int num2) that accepts one double and one  
  integer and returns num1 to the power of num2 (num1 power num2). 
3. Call your method from another class without instantiating the class (i.e. call it 
  like Calculator.powerInt(12,10) since your methods are defined to be static)

Hint: Use Math.pow(double,double) to calculate the power.
*/

import java.io.*;
import java.util.*;
public class Power_Calculator
{
	public static void main(String args[])
	{

		System.out.println(Calculator.powerInt(12, 10));
	}
	
}
// Creating a sub class
class Calculator
{
	public static double powerInt(int num1,int num2)
	{
		return  Math.pow(num1,num2);
	}
	public static double powerDouble(double num1,int num2)
	{
		return Math.pow(num1,num2);
	}
}

