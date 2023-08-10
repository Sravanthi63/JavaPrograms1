/*Assignment 2: Method Overriding
In this assignment, you are required to create a base class called Shape and two derived classes called Circle and Rectangle. The Shape class should have a method named area that returns 0. The Circle class should override the area method to calculate and return the area of the circle, given its radius. The Rectangle class should override the area method to calculate and return the area of the rectangle, given its length and width.
Your task is to write the Shape, Circle, and Rectangle classes and demonstrate the use of method overriding by creating objects of each class, calling the area method on them, and printing the calculated areas.*/
class Shape
  {
    void area()
    {
      System.out.println("0");
    }
  }
class Circle extends Shape
  {
   void area()
     {
      float r=5.4f;
       System.out.println("The area of a circle is:"+(3.14*r*r));
     }
  }
class Rectangle extends Shape
  {
    void area()
    {
      int length=45;
      int width=3;
      System.out.println("The area of rectangle is:"+(length*width));
    }
  }
class Shape1
  {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape c=new Circle();
      c.area();
      Shape r=new Rectangle();
      r.area();
    }
  }

