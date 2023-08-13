import java.util.Scanner;
class CalApp
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      double a=sc.nextDouble();
      System.out.println("Enter b value");
      double b=sc.nextDouble();
      System.out.println("Enter operator to perform calculation");
      char ch=sc.next().charAt(0);
      if(ch=='+')
      {
        
        System.out.println(+(a+b));
      }
      else if(ch=='-')
      {
        System.out.println(+(a-b));
      }
      else if(ch=='*')
      {
        System.out.println(+(a*b));
      }
      else if(ch=='%')
      {
        System.out.println(+(a%b));
      }
      else if(ch=='/')
      {
        System.out.println(+(a/b));
      }
     else 
        System.out.println("INVALID");
    }
  }