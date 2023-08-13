import java.util.Scanner;
class LeapYear
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter year");
      int a=s.nextInt();
      if(a%400==0)
      {
        System.out.println(a+" is leap year");
      }
      else
        System.out.println("It is not leap year");
    }
  }