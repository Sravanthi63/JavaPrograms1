/*Shape Interface Create an interface called Shape with the following methods:
calculateArea(): Abstract method that calculates and returns the area of the shape.
calculatePerimeter(): Abstract method that calculates and returns the perimeter of the shape.
getDescription(): Abstract method that returns a String describing the shape.
Now, create classes Circle, Rectangle, and Triangle, implementing the Shape interface. Write appropriate code to calculate the area and perimeter for each shape and provide a description.*/
interface Shape
  {
    public void area();
    public void perimeter();
    public void getDescription();
  }
class Rectangle implements Shape
  {
    int len=10;
    int bre=8;
    public void area()
    {
      System.out.println("the area of the rectangle is "+(len*bre));
    }
    public void perimeter()
    {
      System.out.println("the perimeter of the rectangle is "+(2*(len+bre)));
    }
    public void getDescription()
    {
      System.out.println("the rectangle has length and breadth for calculating area and perimeter");
    }
  }
class Triangle implements Shape
  {
    int h=8;
    int b=12;
    int h1=14;
    public void area()
    {
      System.out.println("the area of the triangle is "+(0.5*b*h));
    }
    public void perimeter()
    {
      System.out.println("the perimeter of the triangle is "+(b+h+h1));
    }
    public void getDescription()
    {
      System.out.println("the triangle contains sides and its heights to claculate area and perimeter");
    }
  }
class Circle implements Shape
{
  float r=23.65f;
  public void area()
  {
    System.out.println("the area of the circle is"+(3.14*r*r));
  }
  public void perimeter()
  {
    System.out.println("the perimeter of the circle is "+(2*3.14*r));
  }
  public void getDescription()
  {
    System.out.println("the circle consists radius to calculate the area and circumference");
  }
}
class ShapeInterface
  {
    public static void main(String args[])
    {
     Shape rec=new Rectangle();
      Shape t=new Triangle();
      Shape c=new Circle();
      rec.area();
      rec.perimeter();
      rec.getDescription();
      t.area();
      t.perimeter();
      t.getDescription();
      c.area();
      c.perimeter();
      c.getDescription();
    } 
    }
