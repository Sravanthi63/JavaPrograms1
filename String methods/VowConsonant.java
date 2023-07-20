import java.util.Scanner;
class VowConsonant
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the string");
      String str=sc.nextLine();
      int vowcount=0;
      int concount=0;
      int n=str.length();
      for(int i=0;i<n;i++)
        {
          if((str.charAt(i)=='a')||(str.charAt(i)=='e')||(str.charAt(i)=='i')||(str.charAt(i)=='o')||(str.charAt(i)=='u')||(str.charAt(i)=='A')||(str.charAt(i)=='E')||(str.charAt(i)=='I')||(str.charAt(i)=='O')||(str.charAt(i)=='U'))
          {
            vowcount++;
          }
          else
            concount++;
        }
      System.out.println("Vowels in a string:"+vowcount);
      System.out.println("Consonants in a string:"+concount);
    }
  }