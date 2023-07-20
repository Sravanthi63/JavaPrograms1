import java.util.*;
class Person1
  {
    String name;
    int age;
    String address;
    public Person1(String n,int a,String add)
    {
      name=n;
      age=a;
      address=add;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Person1 person[]=new Person1[4];
      for(int i=0;i<person.length;i++)
        {
          System.out.println("Enter person"+(i+1)+"details");
          System.out.println("Enter name");
          String n=sc.next();
          System.out.println("Enter age");
          int a=sc.nextInt();
          System.out.println("Enter address");
          String add=sc.next();   
          person[i]=new Person1(n,a,add);
           }
      for(int i=0;i<person.length;i++)
        {
          person[i].display();
        }
    }
    public void display()
    {
      System.out.println("Person name is:"+name);
      System.out.println("Person age:"+age);
      System.out.println("Person address:"+address);
    }
  }