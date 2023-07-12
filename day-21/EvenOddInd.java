import java.util.Scanner;
class EvenOddInd
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String s="";
        for(int i=0;i<str.length();i++)
          {
            if(i%2==0)
            {
              s=s+str.charAt(i);
            }
          }
      for(int i=0;i<str.length();i++)
        {
          if(i%2!=0)
          {
            s=s+str.charAt(i);
          }
        }
      System.out.println(s);
    }
  }
