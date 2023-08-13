import java.util.Scanner;
class AgeCal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter present year");
      int year=sc.nextInt();
      System.out.println("Enter your birth year");
      int birth=sc.nextInt();
      int age=year-birth;
      System.out.println("Your present age is "+age);
      if(age>=18)
      {
        System.out.println("Major");
      }
      else 
        System.out.println("Minor");
    }
  }