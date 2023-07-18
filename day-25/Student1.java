/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a method named setStudentDetails that takes arguments for each variable and initializes the object. Display the student's details using a separate method.*/
class Student1
  {
    String name;
    int rollno;
    char grade;
    public void setStudentDetails(String n,int r,char g)
    {
      name=n;
      rollno=r;
      grade=g;
    }
    public void display()
    {
      System.out.println("The student name is:"+name);
      System.out.println("Student roll number is:"+rollno);
      System.out.println("Student grade is:"+grade);
    }
    public static void main(String args[])
    {
      Student1 stu=new Student1();
      Student1 stu1=new Student1();
      Student1 stu2=new Student1();
      stu.setStudentDetails("sravanthi",10,'A');
      stu1.setStudentDetails("lakshmi",21,'B');
      stu2.setStudentDetails("durga",12,'B');
      stu.display();
      stu1.display();
      stu2.display();
    }
  }