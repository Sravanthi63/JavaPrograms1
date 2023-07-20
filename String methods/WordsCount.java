import java.util.Scanner;
class WordsCount
  {
    public static void main(String args[])
    {
      int count=0;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter string");
      String s=sc.nextLine();
      int n=s.length();
       String str1[]=s.split(" ");
      for(int i=0;i<str1.length;i++)        
      {
       count++;
         
      }
      System.out.println("Number of words in a string is:"+count);
  }
  }
