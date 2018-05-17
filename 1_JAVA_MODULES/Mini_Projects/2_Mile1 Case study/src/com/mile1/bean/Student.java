package com.mile1.bean;

public class Student {
	/*Instance variables*/
	public String name;
	public int[] marks = new int[3];
	
	/*Default constructors-> Executed when object is being created*/
	/*Constructor has same name as that of class*/
	public Student(String name,int[] marks)
	{
		/*this-> It is a reference variable in java refers to current object*/
		this.name = name;
		this.marks[0] = marks[0];
		this.marks[1] = marks[1];
		this.marks[2] = marks[2];
	}

}
