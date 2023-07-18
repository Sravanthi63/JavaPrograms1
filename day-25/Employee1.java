/*Create a class called "Employee" with instance variables for storing the employee's name, designation, and salary. Implement a method named setEmployeeDetails that takes arguments for each variable and initializes the object. Implement another method named displayEmployeeDetails to display the employee details.*/
class Employee1
  {
    String name;
    String designation;
    int salary;
    public void setEmployeeDetails(String n,String d,int s)
    {
      name=n;
      designation=d;
      salary=s;
    }
    public void displayEmployeeDetails()
    {
      System.out.println("Employee name:"+name);
      System.out.println("Employee Designation:"+designation);
      System.out.println("Employee salary:"+salary);
    }
    public static void main(String args[])
    {
      Employee1 e=new Employee1();
      Employee1 e1=new Employee1();
      Employee1 e2=new Employee1();
      e.setEmployeeDetails("sravanthi","Manager",40000);
      e1.setEmployeeDetails("lakshmi","hr.manager",50000);
      e2.setEmployeeDetails("mounika","personal secretery",55000);
      e.displayEmployeeDetails();
      e1.displayEmployeeDetails();
      e2.displayEmployeeDetails();
    }
  }