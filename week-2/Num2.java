import java.util.Scanner;
class Num2
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter number");
      int n=sc.nextInt();
      int i;
      for(i=1;i<=n;i++)
        {
          System.out.println(i);
        }
    }
  }