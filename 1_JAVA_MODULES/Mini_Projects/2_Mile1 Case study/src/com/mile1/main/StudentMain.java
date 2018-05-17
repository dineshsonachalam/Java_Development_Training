package com.mile1.main;
import com.mile1.bean.Student;
import com.mile1.exception.NullMarksArrayException;
import com.mile1.exception.NullNameException;
import com.mile1.exception.NullStudentException;
import com.mile1.service.StudentReport;
import com.mile1.service.StudentService;
public class StudentMain 
{
	/*
	 The static variable can be used to refer the common property of all objects
	  (that is not unique for each object) e.g. company name of employees,college name of students etc.
	 */
	/*
	  data[] -> reference variable of class Student
      data[] is pointing to object of class Student
      
	 */
	
	/*Creation of static array of objects */
	static Student data[] = new Student[4];
	/*The above statement creates the array which can hold references to 4 Student objects.*/
	
	/*	The Student objects have to be instantiated using the constructor of the Student class 
	 *  and their references should be assigned to the array elements in the following way. 
		data[0] = new Student();*/
	
	/*
	   static block (also called static clause) which can be used for static initializations of a class. 
	   This code inside static block is executed only once: the first time you make an object of that class
	   or the first time you access a static member of that class
	   (even if you never make an object of that class
	 */
	
	static
	{
			data[0] = new Student("Sekar",new int[]{35,32,33});
			data[1] = new Student("Kumar",new int[]{45,46,48});
			data[2] = new Student("Sivaji",new int[] {12,13,14});
			data[3] = new Student("Dinesh",new int[] {14,15,16});
	}
	public static void main(String args[])
	{
		/*
		System.out.println(data[0].name); //Sekar
		System.out.println(data[1].name); //Kumar
		System.out.println(data[0].marks[0]);
		System.out.println(data[0].marks[1]);
		System.out.println(data[0].marks[2]);
		*/
		System.out.println("I am in StudentMain function!");
		StudentService studentService = new StudentService();
		StudentReport studentReport = new StudentReport();
		System.out.println("Grades Calculation:");
		String x = null;
		for(int i=0;i<data.length;i++)
		{
			try{
					x= StudentReport.validate(data[i]);
			}
			catch(NullNameException e) {x="NullNameException occured";}
			catch(NullMarksArrayException e) {x="NullMarksArrayException occured";}
			catch(NullStudentException e) {x="NullStudentException occured";}
			System.out.println("GRADE="+x);
			
			
		}
		System.out.println("Number of Objects with Marks array as null ="+studentService.findNumberOfNullMarks(data));
		System.out.println("Number of Objects with Name as null ="+studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entirely null="+studentService.findNumberOfNullObjects(data));
		
	}
}
