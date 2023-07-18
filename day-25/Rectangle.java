/*Create a class called "Rectangle" with instance variables for storing the length and width of a rectangle. Implement methods to calculate and return the area and perimeter of the rectangle.*/
import java.util.*;
class Rectangle
  {
    int length;
    int width;
    public void display()
    {
      System.out.println("The area of rectangle is:"+(length+width));
      System.out.println("The perimeter of rectangle is:"+(2*(length+width)));
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      Rectangle r=new Rectangle();
      System.out.println("Enter length");
      r.length=sc.nextInt();
      System.out.println("Enter width");
      r.width=sc.nextInt();
      r.display();
    }
  }