import java.util.Scanner;
class FirstOcc
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      System.out.println("Enter the character");
      char ch=sc.next().charAt(0);
      int str1=str.indexOf(ch);
      System.out.println("The first occurence is:"+str1);
    }
  }