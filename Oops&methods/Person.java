/*Create a class called "Person" with instance variables for storing the person's name, age, and address. Implement a constructor that takes arguments for each variable and initializes the object.*/
import java.util.*;
class Person
  {
    String name;
    int age;
    String address;
    Person(String n,int a,String add)
    {
      name=n;
      age=a;
      address=add;
    }
    public void display()
    {
      System.out.println("Name is:"+name);
      System.out.println("Age is:"+age);
      System.out.println("Address is:"+address);
    }
    public static void main(String args[])
    {
      Person person=new Person("sravanthi",21,"vijayawada");
       person.display();
      
    }
  }