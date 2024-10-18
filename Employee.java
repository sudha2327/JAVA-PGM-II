import java.util.*;
 public class Employee
 {
  int empno;
  String empname;
  double basic_salary,gross_salary;
  
  void read_emp(int x,String y,double z)
  {
   empno=x;
   empname=y;
   basic_salary=z;
  }
  void calculate_gross()
  {
   gross_salary=basic_salary+(0.1*basic_salary)+(0.25*basic_salary);
  }
  void display_emp()
  {
   System.out.println("------------------------.   ------------------------------");
   System.out.println("Display the details of an employee");
   System.out.println("Employee number is: " +empno);
   System.out.println("Name of the employeeis: " +empname);
   System.out.println(" basic salary of the employee  is: " +basic_salary);
   System.out.println(" Gross salary of the employee  is: " +gross_salary);
   }
 
  public static void main(String[] arg)
  {
   int a;
   String b;
   double c;
   Scanner input=new Scanner(System.in);
   Employee obj= new Employee();
   System.out.println("Read the attributes of the employee:");
   System.out.println("Enter the employee number:");
   a=input.nextInt();
   System.out.println("Enter employee name :");
   b=input.next();
   System.out.println("Enter basic salary of the employee:");
   c=input.nextDouble();
   obj.read_emp(a,b,c);
   obj.calculate_gross();
   obj.display_emp();
   }
  }