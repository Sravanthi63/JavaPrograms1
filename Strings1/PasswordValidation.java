import java.util.Scanner;
class PasswordValidation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter your password");
      String password=sc.nextLine();
      int ucount=0;
      int lcount=0;
      int dcount=0;
      int scount=0;
      char ch;
      for(int i=0;i<password.length();i++)
        {
          ch=password.charAt(i);
          if(password.length()>=8)
          {
            if(ch>='A'&&ch<='Z')
            {
              ucount++;
            }
            if(ch>='a'&& ch<='z')
            {
              lcount++;
            }
            if(ch>='0'&&ch<='9')
            {
              dcount++;
            }
            else
              scount++;
          }
        }
      if(ucount>0&&lcount>0&&dcount>0&&scount>0)
      {
        System.out.println("Valid password");
      }
      else
        System.out.println("Invalid password");
    }
  }