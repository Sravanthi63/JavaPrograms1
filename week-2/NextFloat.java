import java.util.Scanner;
class NextFloat
  {
    public static void main(String args[])
    {
      float a,b;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value:");
      a=sc.nextFloat();
      System.out.println("Enter b value:");
      b=sc.nextFloat();
      float c=a*b;
      System.out.println("The value is: "+c);
    }
  }