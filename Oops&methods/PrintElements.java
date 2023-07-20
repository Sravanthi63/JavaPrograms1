//without return type without parameter
import java.util.Scanner;
class PrintElements
  {
    public void printarray()
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int n=sc.nextInt();
      int a[]=new int[n];
      System.out.println("Enter the array elements");
      for(int i=0;i<n;i++)
        {
          a[i]=sc.nextInt();
        }
      System.out.println("The array elements are");
      for(int i=0;i<n;i++)
        {
          System.out.println(a[i]);
        }
    }
    public static void main(String args[])
    {
      PrintElements pe=new PrintElements();
      pe.printarray();
    }
  }