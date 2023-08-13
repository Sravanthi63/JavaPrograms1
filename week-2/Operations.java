import java.util.Scanner;
class Operations
  {
    public static void main(String args[])
    {
      int n1,n2;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter first number:");
      n1=sc.nextInt();
      System.out.println("Enter second number:");
      n2=sc.nextInt();
      System.out.println("n1*=n2 "+(n1*=n2));
      System.out.println("n1-=n2 "+(n1-=n2));
      System.out.println("n1/=n2 "+(n1/=n2));
      System.out.println("n1%=n2 "+(n1%=n2));
    }
  }