import java.util.Scanner;
class StrLongPal
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String str1[]=str.split(" ");
      for(int i=0;i<str1.length;i++)
        {
          String temp=str1[i];
          String rev="";
          for(int j=temp.length()-1;j>=0;j--)
            {
            rev=rev+temp.charAt(j);
            }
          if(temp.equals(rev))
            System.out.println(temp+"");
        }
    }
    }