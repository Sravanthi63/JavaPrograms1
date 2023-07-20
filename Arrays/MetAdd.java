import java.util.Scanner;
class MetAdd
  {
    public void add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number");
      int a=sc.nextInt();
      System.out.println("Enter b number");
      int b=sc.nextInt();
      System.out.println("The sum is:"+(a+b));
    }
    public static void main(String args[])
    {
      MetAdd ma=new MetAdd();
      ma.add();
    }
  }