import java.util.Scanner;
class AlphabetDigits
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a value");
       char ch=s.next().charAt(0);
      if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
      {
        System.out.println("given value is a Alphabet");
      }
      else if(ch>='0'&&ch<='9')
      {
        System.out.println("given value is a number");
      }
     else{
       System.out.println("given value is a special character");
     }
    }
  }