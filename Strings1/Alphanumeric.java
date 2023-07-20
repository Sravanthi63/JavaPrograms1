import java.util.Scanner;
class Alphanumeric
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      int n=str.length();
      int acount=0;
      int dcount=0;
       int scount=0;
      for(int i=0;i<n;i++)
        {
          if(((str.charAt(i)>='a')&&(str.charAt(i)<='Z'))||((str.charAt(i)>='a')&&(str.charAt(i)<='z')))
            {
              acount++;
            }
            
           else if((str.charAt(i)>='0')&&(str.charAt(i)<='9'))
           {
             dcount++;
           }
            
          else
             scount++;
        }
    
      System.out.println("The total no.of characters in a string is:"+acount);
      System.out.println("The total no.of digits in a string is:"+dcount);
      System.out.println("The total no.of special characters in a string is:"+scount);
    }
  }