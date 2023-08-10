class Person
  {
    void display()
    {
      System.out.println("The person can be a:");
    }
     }
class Student extends Person
  {
    void display()
    {
      System.out.println("Student");
    }
  }
class Worker extends Person
  {
    void display()
    {
      System.out.println("Worker");
    }
  }
class Homemaker extends Person
  {
    void display()
    {
      System.out.println("Homemaker");
    }
  }
class Constructor
  {
    public static void main(String args[])
    {
      Person p=new Person();
      p.display();
      Worker w=new Worker();
      w.display();
      Student s=new Student();
      s.display();
      Person h=new Homemaker();
      h.display();
    }
  }

