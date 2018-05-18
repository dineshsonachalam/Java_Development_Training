
/*
 1. Create a class Box that uses a parameterized method to initialize the dimensions of a box.
 (dimensions are width, height, depth of double type). The class should have a method that can return volume. 
 Obtain an object and print the corresponding volume in main() function.
 
 Topics used: Classes and Objects, Constructor
 */
import java.io.*;
import java.util.*;
public class Box 
{
	// parametrized construtor
	public static double Box(double width,double height,double depth)
	{
		
		return width*height*depth;
	}
	public static void main(String args[])
	{
	
		// reference variable obj of class Box pointing to an object
		double width =  20;
		double height = 30;
		double depth =  40;
		double volume = Box(width,height,depth);
		System.out.println(volume);
				
	}

}
