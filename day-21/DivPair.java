import java.util.Scanner;
class DivPair
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter an integer divisor");
      int div=sc.nextInt();
      int count=0;
      for(int i=0;i<n;i++)
        {
          int sum=0;
          for(int j=i+1;j<n;j++)
            {
              if(i<j)
              {
                if((a[i]+a[j])%div==0)
                {
                  count++;
                }
              }
            }
        }
      System.out.println("Total no.of pairs are:"+count);
    }
    
  }