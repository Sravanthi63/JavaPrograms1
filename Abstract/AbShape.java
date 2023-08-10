abstract class Shape
  {
    abstract void calArea();
  }
class Rectangle extends Shape
{
  public void calArea()
  {
    int length=10;
    int breadth=12;
    System.out.println("Area of the rectangle is:"+(length*breadth));
  }
}
  class Square extends Shape
    {
      public void calArea()
      {
      int side=3;
      System.out.println("Area of the square is:"+(side*side));
      }
    }
class Triangle extends Shape
  {
    public void calArea()
    {
      int height=34;
      int base=3;
      System.out.println("Area of the triangle is:"+(0.5*height*base));
    }
  }
class AbShape
  {
    public static void main(String args[])
    {
      Rectangle r=new Rectangle();
      Square s=new Square();
      Triangle t=new Triangle();
      r.calArea();
      s.calArea();
      t.calArea();
    }
  }