import java.util.Scanner;
class VowelOrConsonent
  {
    public static void main(String args[])
    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter a character");
      char ch=s.next().charAt(0);
      if((ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')||(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
      {
        System.out.println("Given character is a Vowel");
      }
      else
      {
        System.out.println("Given character is not a Vowel");
      }
    }
  }