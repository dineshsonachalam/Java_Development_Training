/*
 2. Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the 
employee class are annual salary (double), the year the employee started to work, 
and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class TestEmployee 
{
	public static void main(String args[])
	{
		Person obj = new Person();
		obj.setName("Dinesh");
		Employee obj_2 = new Employee();
		obj_2.set_Employee_details(300000, 2018, "12345");
		System.out.println("Employee Name:"+obj.getName());
		System.out.println("Employee Annual Salary:"+obj_2.get_annual_salary());
		System.out.println("Employee Starting date:"+obj_2.get_employee_starting_year());
		System.out.println("Employee National Insurance Number:"+obj_2.get_national_insurance_number());
	}
}
