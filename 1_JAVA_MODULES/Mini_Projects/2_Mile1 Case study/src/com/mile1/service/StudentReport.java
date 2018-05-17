package com.mile1.service;

import com.mile1.bean.Student;

public class StudentReport 
{
	/*Only valid objects are passed into this function*/
	public String findGrade(Student studentObject)
	{
		/*Get marks from the student object*/
		/*
		  if(marks<35)
		  {
		  	return "F"; //Fail Grade
		  }
		  else
		  {
		  	sum = mark1 + mark2 + mark3;
		  	if(sum<=150)
		  	{
		  		return "D"; //D grade
		  	}
		  	else if(sum>150 && sum<=200)
		  	{
		  		return "C"; //C grade
		  	}
		  	else if(sum>200 && sum<=250)
		  	{
		  		return "B"; //B grade
		  	}
		  	else if(sum>250 && sum<=300)
		  	{
		  		return "A"; //A grade
		  	}
		  	
		  }
		 
		  
		  
		  
		 */
		
		return null;
		
	}
	public static  String validate(Student studentObject) 
	{
		/*
		 
		  if(studentObject == null)
		  {
		  	throw NullStudentException;
		  }
		  else
		  {
		  	boolean flag = true;
		  	 if(name == null)
		  	 {
		  	 	flag = false
		  	 	throw NullNameException
		  	 }
		  	 if(marks_array == null) //marks_array.length<=0
		  	 {
		  	 	flag = false;
		  	 	return NullMarksArrayException
		  	 }
		  	 if(flag==true) // no Exception occured data is valid
		  	 {
		  	 		return findGrade(studentObject);
		  	 }
		  }
		  
		 
		  
		  
		  
		 */
		return null;
	}
}
