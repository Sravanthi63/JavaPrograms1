/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a constructor that initializes these variables and display the employee's details.*/
import java.util.*;
class Employee
  {
    String name;
    String designation;
    int salary;
    public void display()
    {
      System.out.println("The name of the employee is:"+name);
      System.out.println("The designation of the employee is:"+designation);
      System.out.println("The salary of an employee is:"+salary);
    }
    public static void main(String args[])
    {
      Employee e=new Employee();
      Employee e1=new Employee();
      Employee e2=new Employee();
      e.name="sravanthi";
      e.designation="hr.manager";
      e.salary=55000;
      e1.name="lakshmi";
      e1.designation="manager";
      e1.salary=45300;
      e2.name="mounika";
      e2.designation="employee";
      e2.salary=30000;
      e.display();
      e1.display();
      e2.display();
    }
  }