import java.util.Scanner;
class NextDouble
  {
    public static void main(String args[])
    {
      double a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value:");
      a=sc.nextDouble();
      System.out.println("Enter b value:");
      b=sc.nextDouble();
      Double c=(a+b)/2;
      System.out.println("Average is: "+c);
    }
  }