class person
  {
    String name="sravanthi";
    int age=22;
    void display()
    {
      System.out.println(name+" "+age);
    }
  }
class Student extends person
  {
    String branch="MPCS";
    int year=3;
    int rollno=10;
    void details()
    {
      System.out.println(branch+" "+year+" "+rollno);
    display();  
    }
   }
class SuperEx
  {
   public static void main(String args[])
    {
      Student s=new Student();
      s.details();
    }
  }