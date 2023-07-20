import java.util.Scanner;
class LeftRotation
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements in an array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("Enter the position number for how many positions you want to shift");
      int n=sc.nextInt();
      for(int j=1;j<n;j++)
        {
         int temp=a[0];
          for(int i=0;i<size-1;i++)
            {
              a[i]=a[i+1];
            }
          a[size-1]=temp;
          System.out.println("After performing the rotation");
          for(int i=0;i<size;i++)
            {
              System.out.println(a[i]);
            }
        }
    }
  }