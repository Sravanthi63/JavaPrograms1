import java.util.Scanner;
class StrFrequency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      char ch[]=str.toCharArray();
      boolean b[]=new boolean[ch.length];
      for(int i=0;i<b.length;i++)
        {
          b[i]=false;
        }
      for(int i=0;i<ch.length;i++)
        {
          int count=1;
          if(b[i]==true)
          {
            continue;
          }
          for(int j=i+1;j<ch.length;j++)
            {
              if(ch[i]==ch[j])
              {
                count++;
                b[j]=true;
              }
            }
          System.out.println("The character "+ch[i]+" is repeated for" +count+ " times");   
        }
    }
  }