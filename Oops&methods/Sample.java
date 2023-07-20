//with return type without parameters
import java.util.Scanner;
class Sample
  {
    public int add()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a value");
      int a=sc.nextInt();
      System.out.println("Enter b value");
      int b=sc.nextInt();
      int res=a+b;
      return res;
    }
    public static void main(String args[])
    {
      Sample s=new Sample();
      int sum=s.add();
      System.out.println("The sum is:"+sum);
    }
  }