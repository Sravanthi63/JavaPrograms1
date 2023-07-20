import java.util.*;
class StrChar
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      int A_count=0,D_count=0,S_count=0;
      for(int i=0;i<str.length();i++)
        {
          if(str.charAt(i)>='a'&&str.charAt(i)<='z'||str.charAt(i)>='A'&&str.charAt(i)<='Z')
          {
            A_count++;
          }
          else if(str.charAt(i)>='0'&&str.charAt(i)<='9')
          {
            D_count++;
          }
          else
            S_count++;
        }
      System.out.println("Alphabets in a string are:"+A_count);
      System.out.println("Digits in a string are:"+D_count);
      System.out.println("Special characters in a string are:"+S_count);
    }
  }