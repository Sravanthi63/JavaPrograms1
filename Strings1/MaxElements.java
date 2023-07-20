import java.util.Scanner;
class MaxElements
  {
    public static void max(int a[],int size)
    {
      int max=a[0];
      for(int i=0;i<size;i++)
        {
          if(max<a[i])
          {
            max=a[i];
          }
        }
      System.out.println("Maximum number is: "+max);
    }
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      System.out.println("Enter the elements");
      int a[]=new int[size];
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
  max(a,size);
    }
    }
