import java.util.Scanner;
class Greater
  {
    public static void main(String args[])
    {
     Scanner sc=new Scanner(System.in);
      System.out.println("enter thr value of a number");
      int num=sc.nextInt();
      if(num>10)
      {
        System.out.println("the number s greater than 10");
        }
      else
      {
        System.out.println("the number is less than 10");
      }
    }
  }