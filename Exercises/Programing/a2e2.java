//2. Write a program to enter a employee details .The data should be entered dynamically using scanner class. Employee Details are empno, name, address , salary ,designation and department.


Import java.until.Scanner;
Class EmployeeDetails

{
  Int empno;
  Float salary;
  String name, address, desig, dep;
}
class Main{
            public static void main(String args[]) 
   {
      Scanner sc = new Scanner(System.in);
      System.out.print("Hi! Let’s register a new employee! You will need to fill in the following data:");
      System.out.print("Employee name: ");
      name = sc.nectln();
      System.out.print("Employee number: ");
      empno = sc.nectln();
      System.out.print(“Adress information:");
      adress = sc.nectln();
      System.out.print("Employee designation: ");
      desig = sc.nectln();
      System.out.print("Department: ");
      dep  = sc.nectln();
      System.out.print("Salary: ");
      salary = sc.nectln();
      }
}
