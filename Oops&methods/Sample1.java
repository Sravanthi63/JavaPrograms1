//with return type with parameters
import java.util.*;
class Sample1
  {
    public int add(int a,int b)
    {
      int c=a+b;
      return c;
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a and b values");
      int a=sc.nextInt();
      int b=sc.nextInt();
      Sample1 s=new Sample1();
      int d=s.add(a,b);
      System.out.println("The sum is:"+d);
    }
  }