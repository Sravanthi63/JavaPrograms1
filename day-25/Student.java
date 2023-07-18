import java.util.*;
class Student
  {
    int rollno;
    String name;
    public void display()
    {
      System.out.println("rollno is"+rollno);
      System.out.println("name is"+name);
    }
    public static void main(String args[])
    {
      Student student=new Student();
      student.rollno= 12;
      student.name="sravanthi";
      student.display();
    }
  }