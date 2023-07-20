import java.util.*;
class EmailValid
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the Email");
      String str=sc.nextLine();
      int scount=0,ecount=0;
      if(str.contains("@")&&str.contains("."))
      {
        scount++;
      }
if(str.endsWith(".com")||str.endsWith(".org"))
      {
        ecount++;
      }
      if(ecount>0&&scount>0)
      {
        System.out.println("Email is valid");
      }
      else
        System.out.println("Email is invalid");
    }
  }