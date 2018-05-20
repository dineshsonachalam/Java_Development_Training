/*
  3. A HighSchool application has two classes: the Person superclass and the Student subclass. 
  	 Using inheritance, in this lab you will create two new classes, Teacher and CollegeStudent. 
  	 A Teacher will be like Person but will have additional properties such as salary (the amount 
  	 the teacher earns) and subject (e.g. “Computer Science”, “Chemistry”,  “English”, “Other”). 
     The CollegeStudent class will extend the Student class by adding a year
     (current level in college) and major (e.g. “Electrical Engineering”, “Communications”, “Undeclared”). 
 */

class Person_1
{
	char gender = 'm';
}
class Student extends Person_1
{
	String student_name = "Dinesh";
}
class Teacher extends Person_1
{
	int salary = 10000;
	String subject = "Computer Science";
}
public class CollegeStudent extends Student 
{
	int current_level_in_college = 3;
	String name = "Computer Science";
	public static void main(String args[])
	{
		CollegeStudent obj = new CollegeStudent();
		System.out.println("Person Gender:"+obj.gender);
		System.out.println("Student Name:"+obj.student_name);
		Teacher obj_2 = new Teacher();
		System.out.println("Teacher Salary:"+obj_2.salary);
		System.out.println("Teacher Subject:"+obj_2.subject);
		
	}
}

