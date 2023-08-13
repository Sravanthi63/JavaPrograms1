import java.util.Scanner;
class PosNeg
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a value");
      int num=s.nextInt();
      if(num>0)
      {
        System.out.println("Given number is positive");
      }
      else if(num<0)
      {
        System.out.println("Given number is negative");
      }
      else
        System.out.println("Given number is zero");
    }
  }