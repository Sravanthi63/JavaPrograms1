class Areas
  {
    public void area()
    {
      System.out.println("Areas");
    }
    public  void area(int length,int base)
    {
      System.out.println("Area of triangle is:"+(0.5*length*base));
    }
    public void area(float side)
    {
      System.out.println("Area of square is:"+(side*side));
    }
    public  void area(float length,int breadth)
    {
      System.out.println("Area of the rectangle is:"+(length*breadth));
    }
    public void area(int radius)
    {
      System.out.println("Area of the circle is:"+(3.14*radius*radius));
    }
  }
class Shapes
  {
    public static void main(String args[])
    {
      Areas a=new Areas();
      a.area();
      a.area(3,5);
      a.area(3.12f);
      a.area(2.13f,5);
      a.area(5);
    }
  }