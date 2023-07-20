import java.util.*;
class MaxWord
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      String s[]=str.split(" ");
      int max=s[0].length();
      String word="";
      for(int i=0;i<s.length;i++)
        {
          if(max<s[i].length())
          {
            max=s[i].length();
            word=s[i];
          }
        }
      System.out.println("Largest word in the given sentence is:"+word);
    }
  }