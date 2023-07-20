/*Create a class called "Student" with instance variables for storing the student's name, roll number, and grade. Implement a constructor that takes arguments for each variable and initializes the object.*/
class Student2
  {
    String name;
    int rollno;
    char grade;
    Student2(String n,int r,char g)
    {
      name=n;
      rollno=r;
      grade=g;
    }
    public void display()
    {
      System.out.println("Name "+name);
      System.out.println("Roll number "+rollno);
      System.out.println("Grade "+grade);
    }
    public static void main(String args[])
    {
      Student2 student=new Student2("sravs",10,'A');
      student.display();
    }
  }