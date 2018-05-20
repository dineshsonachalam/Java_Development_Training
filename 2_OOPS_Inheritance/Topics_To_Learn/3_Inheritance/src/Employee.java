/*
 2. Create a class called Person with a member variable name. Save it in a file called Person.java
Create a class called Employee who will inherit the Person class.The other data members of the 
employee class are annual salary (double), the year the employee started to work, 
and the national insurance number which is a String.Save this in a file called Employee.java
Your class should have a reasonable number of constructors and accessor methods.
Write another class called TestEmployee, containing a main method to fully test your class definition.
 */
public class Employee extends Person 
{
	double annual_salary;
	int employee_starting_year;
	String national_insurance_number;
	/*
	public void setannual_salary(double annual_salary)
	{
		this.annual_salary = annual_salary;
	}
	p
	*/
	public void set_Employee_details(double annual_salary,int employee_starting_year,String national_insurance_number)
	{
		this.annual_salary = annual_salary;
		this.employee_starting_year = employee_starting_year;
		this.national_insurance_number = national_insurance_number;
	}
	public double get_annual_salary()
	{
		return annual_salary;
	}
	public int get_employee_starting_year()
	{
		return employee_starting_year;
	}
	public String get_national_insurance_number()
	{
		return national_insurance_number;
	}

	
}
