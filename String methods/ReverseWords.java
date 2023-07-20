import java.util.Scanner;
class ReverseWords
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String s=sc.nextLine();
      String s1[]=s.split(" ");
      String reverse="";
      for(int i=s1.length-1;i>=0;i--)
        {
          reverse=(reverse+s1[i]);
          
        }
      System.out.println(reverse);
    }
  }