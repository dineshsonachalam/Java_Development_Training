/*
    Note 0: Initialize 2 arrays -> employee_details &&  designation_details
    Note 1: Salary should be calculated as (Basic + HRA + DA –IT)
    Note 2: Use switch-case to print Designation and to find the value of DA
            for a particular employee.
    Note 3: Use command line arguments
*/
public class project1
{
    public static void main(String[] args)
    {
        if(args.length>0)
        {
        // 7*8 dimensions (7 rows and 8 columns)
        String[][] employee_details = {
          {"1001", "Ashish", "01/04/2009", "e", "R&D", "20000", "8000", "3000"},
          {"1002", "Sushma", "23/08/2012", "c", "PM" ,"30000" ,"12000", "9000"},
          {"1003", "Rahul" , "12/11/2008", "k", "Acct" ,"10000" ,"8000" ,"1000"},
          {"1004", "Chahat", "29/01/2013", "r", "Front Desk", "12000", "6000", "2000"},
          {"1005", "Ranjan", "16/07/2005", "m", "Engg","50000", "20000", "20000"},
          {"1006", "Suman", "1/1/2000", "e", "Manufacturing", "23000", "9000", "4400"},
          {"1007", "Tanmay", "12/06/2006", "c", "PM", "29000", "12000", "10000"}
        };

/*
        System.out.println("Employee Details:");
        for(int i=0;i<7;i++)
        {
            for(int j=0;j<8;j++)
            {
                System.out.print(employee_details[i][j]+" ");
            }
            System.out.println();
        }
*/
//        System.out.println();
//        System.out.println("Designation Details:");
        String[][] designation_details ={
          {"e", "Engineer", "20000"},
          {"c", "Consultant", "32000"},
          {"k", "Clerk", "12000"},
          {"r", "Receptionist" ,"15000"},
          {"m", "Manager", "40000"}
        };
/*
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(designation_details[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
*/
        String option = args[0];

        // find if the employee exists
        boolean flag = false;
        int index = 0;
        System.out.println();
        for(int i=0;i<7;i++)
        {
            if(option.equals(employee_details[i][0]))
            {
                flag =true;
                index = i;
                break;
            }
        }
        if(flag == true)
        {
              int basic = Integer.parseInt(employee_details[index][5]);
              int hra =  Integer.parseInt(employee_details[index][6]);
              int it =  Integer.parseInt(employee_details[index][7]);
              String designation_code =  employee_details[index][3];
              int da = 0;
              String designation  ="";
              String employee_name = employee_details[index][1];
              String employee_department = employee_details[index][4];
              int salary = 0;
              switch(designation_code)
              {
                  case "e":
                    da =  Integer.parseInt(designation_details[0][2]);
                    designation = designation_details[0][1];
                    break;
                  case "c":
                    da =  Integer.parseInt(designation_details[1][2]);
                    designation = designation_details[1][1];
                    break;
                  case "k":
                    da =  Integer.parseInt(designation_details[2][2]);
                    designation = designation_details[2][1];
                    break;
                  case "r":
                    da =  Integer.parseInt(designation_details[3][2]);
                    designation = designation_details[3][1];
                    break;
                  case "m":
                    da =  Integer.parseInt(designation_details[4][2]);
                    designation = designation_details[4][1];
                    break;
              }
              salary = basic+ hra + da - it;
              System.out.println("Emp No.     Emp Name      Department      Designation      Salary");
              System.out.println(option+"        "+employee_name+"         "+employee_department+
              "            "+designation+"          "+salary);

        }
        else
        {
            System.out.println("There is no employee with empid : "+option);
        }
      }
      else
      {
          System.out.println("You have not entered the employee number!");
      }



      }


  }
