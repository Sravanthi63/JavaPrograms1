/*Assignment 3: Student Information System
Create a class named "Student" with private attributes: name, rollNumber, age, and marks.
Implement getter and setter methods for all attributes.
Ensure that the marks attribute can only be accessed through getter and setter methods, not directly.
Add a method named calculateGrade() that calculates the grade based on the marks and returns it as a string (e.g., "A+", "B", "C", etc.).
Add a method named displayDetails() that displays the student's name, roll number, age, marks, and grade.
In the main method, create an array of Student objects to store information for multiple students. Prompt the user to input data for each student, calculate their grades, and display their details.*/
import java.util.*;
class Student
  {
    private String name;
    private int rollno;
    private int age;
    private int marks;
    String grade;
    public void setName(String name)
    {
      this.name=name;
    }
    public String getName()
    {
      return name;
    }
    public void setRollno(int rollno)
    {
      this.rollno=rollno;
    }
    public int getRollno()
    {
      return rollno;
    }
    public void setAge(int age)
    {
      this.age=age;
    }
    public int getAge()
    {
      return age;
    }
    public void setMarks(int marks)
    {
      this.marks=marks;
    }
    public int getMarks()
    {
      return marks;
    }
    public String calculateGrade()
    {
      if(getMarks()>=90&&(getMarks()<=100))
      {
        grade="A Grade";
        return grade;
      }
      else if(getMarks()>=80&&(getMarks()<90))
      {
        grade="B Grade";
        return grade;
      }
       else if(getMarks()>=70&&(getMarks()<80))
      {
        grade="C Grade";
        return grade;
      }
       else if(getMarks()>=65&&(getMarks()<70))
      {
        grade="D Grade";
        return grade;
      }
     else 
         grade="fail";
      return grade;
    }
    
      public void displayDetails()
        {
        System.out.println("Name:"+getName());
        System.out.println("Age:"+getAge());
        System.out.println("Rollno:"+getRollno());
        System.out.println("Marks:"+getMarks());
        System.out.println("Grade:"+calculateGrade());        }
  }
class EncapStudent
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter how many students data we want");
      int n=sc.nextInt();
      Student s[]=new Student[n];
      for(int i=0;i<s.length;i++)
        {
          s[i]=new Student();
          System.out.println("Enter student name");
          
          s[i].setName(sc.next());
           System.out.println("Enter student Rollno");
          s[i].setRollno(sc.nextInt());
           System.out.println("Enter student Age");
          s[i].setAge(sc.nextInt());
           System.out.println("Enter student Marks");
          s[i].setMarks(sc.nextInt());
        }
      for(int i=0;i<s.length;i++)
        {
          s[i].displayDetails();
          s[i].calculateGrade();
        }
    }
  }
