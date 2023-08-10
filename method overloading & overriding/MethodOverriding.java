//method overriding
class Shape
  {
    void area()
    {
      System.out.println("Different areas");
    }
  }
    class Circle extends Shape
      {
        void area()
          {
            float r=4.12f;
      System.out.println("Area of cicrle is" +(3.14*r*r));
          }
    }
    class Triangle extends Shape
      {
       void area()
          {
            int length=5;
            int base=6;
      System.out.println("Area of triangle is" +(0.5*length*base));
    }
      }
  
    class MethodOverriding
      {
    public static void main(String args[])
    {
      Shape s=new Shape();
      s.area();
      Shape c=new Circle();
      c.area();
      Shape t=new Triangle();
      t.area();
    }
  }