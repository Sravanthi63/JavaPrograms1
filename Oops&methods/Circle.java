/*Create a class called "Circle" with an instance variable for storing the radius. Implement a constructor that takes the radius as an argument and initializes the object.*/
class Circle
  {
    double radius;
    Circle(double r)
    {
      radius=r;
    }          
    public void display()
    {
      System.out.println("The radius of the circle is "+radius);
      System.out.println("The area of the circle is:"+(2*3.14*radius));
    }
    public static void main(String args[])
    {
      Circle circle=new Circle(5.12);
      circle.display();
    }
  }