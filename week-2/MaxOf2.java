import java.util.Scanner;
class MaxOf2
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=s.nextInt();
      System.out.println("Enter b value");
      int b=s.nextInt();
      if(a>b)
      {
        System.out.println("Maximum number is: "+a);
      }
      else
        System.out.println("Maximum number is: "+b);
    }
  }