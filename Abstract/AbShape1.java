/*Create an abstract class called "Shape" that has the following abstract methods:
get_area(): Returns the area of the shape.
get_perimeter(): Returns the perimeter of the shape.
Create concrete classes Circle, Rectangle, and Triangle that inherit from the abstract class "Shape." Implement the required methods for each class.
Write a program to:
Create instances of Circle, Rectangle, and Triangle.
Prompt the user to enter dimensions for each shape.
Calculate and display the area and perimeter of each shape.*/
import java.util.*;
abstract class Shape
  {
    Scanner sc=new Scanner(System.in);
    abstract void get_Area();
    abstract void get_Perimeter();
  }
class Rectangle extends Shape
  {
    public void get_Area()
    {
      System.out.println("Enter length of rectangle");
      int l=sc.nextInt();
      System.out.println("Enter breadth of rectangle");
      int b=sc.nextInt();
      int area=l*b;
      System.out.println("Area of rectangle is:"+area);
    }
    public void get_Perimeter()
    {
       System.out.println("Enter length of rectangle");
      int l=sc.nextInt();
      System.out.println("Enter breadth of rectangle");
      int b=sc.nextInt();
      int per=(2*(l+b));
      System.out.println("Area of rectangle is:"+per);
    }
  }
class Triangle extends Shape
  {
     public void get_Area()
    {
      System.out.println("Enter height of triangle");
      int h=sc.nextInt();
      System.out.println("Enter base of triangle");
      int b=sc.nextInt();
      int area=(h*b)/2;
      System.out.println("Area of triangle is:"+area);
  }
    public void get_Perimeter()
    {
      System.out.println("Enter the 1st side");
      int s1=sc.nextInt();
      System.out.println("Enter the 2nd side");
      int s2=sc.nextInt();
      System.out.println("Enter the 3rd side");
      int s3=sc.nextInt();
      int per=s1+s2+s3;
      System.out.println("Perimeter of triangle is:"+per);
    }
  }
class Circle extends Shape
{
  public void get_Area()
  {
    System.out.println("Enter the radius");
    double ra=sc.nextDouble();
    double area=2*3.14*ra;
    System.out.println("Area of a circle is:"+area);
  }
  public void get_Perimeter()
  {
    System.out.println("Enter the radius");
    double ra=sc.nextDouble();
    double per=2*3.14*ra*ra;
    System.out.println("Area of a circle is:"+per);
  }
}
class AbShape1
  {
    public static void main(String args[])
    {
      Shape r=new Rectangle();
      Shape t=new Triangle();
      Shape c=new Circle();
      r.get_Area();
      r.get_Perimeter();
      t.get_Area();
      t.get_Perimeter();
      c.get_Area();
      c.get_Perimeter();
    }
  }