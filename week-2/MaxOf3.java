import java.util.Scanner;
class MaxOf3
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter n1 value");
      int n1=s.nextInt();
      System.out.println("Enter n2 value");
      int n2=s.nextInt();
      System.out.println("Enter n3 value");
      int n3=s.nextInt();
      if((n1>n2)&&(n1>n3))
      {
        System.out.println("Maximum number is: "+n1);
        }
      else if(n2>n3)
      {
        System.out.println("Maximum number is: "+n2);
      }
      else
        System.out.println("Maximum number is: "+n3);
    }
  }