import java.util.Scanner;
class Divisible
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the num1 value");
      int num1=sc.nextInt();
      System.out.println("enter the num2 value");
      int num2=sc.nextInt();
      if(num1%num2==0)
      {
        System.out.println("num1 is divisible by num2");
      }
     else
      {
        System.out.println("num1 is not divisible by num2");
         
}
      }
    }
  