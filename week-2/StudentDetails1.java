import java.util.Scanner;
class StudentDetails1
  {
    public static void main(String args[])
    {
      String Name,branch;
      long phnum;
      char grade;
      short rollno;
      char year;
      float percentage;
      boolean maritalstatus;
      Scanner sc=new Scanner(System.in);
      System.out.println("STUDENTDETAILS");
      System.out.println("Enter your name: ");
      Name=sc.nextLine();
      System.out.println("Enter your mobile number:");
      phnum=sc.nextLong();
      System.out.println("Enter your grade:");
      grade=sc.next().charAt(0);
      System.out.println("Enter your roll number:");
      rollno=sc.nextShort();
      System.out.println("Enter your branch name:");
      branch=sc.nextLine();
      System.out.println("Enter your academic year:");
      year=sc.next().charAt(0);
      System.out.println("Enter your academic percentage:");
      percentage=sc.nextFloat();
      System.out.println("Enter your marital status:");
      maritalstatus=sc.nextBoolean();
    }
  }
  