import java.util.Scanner;
class MetMul
  {
    public void mul()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      System.out.println("Multiplication is:"+(a*b));
    }
    public void sub()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      System.out.println("Substraction is:"+(a-b));
    }
    public static void main(String args[])
    {
      MetMul mm=new MetMul();
      mm.mul();
      mm.sub();
    }
  }