//without return type with parameter
import java.util.*;
class EvenArray
  {
   public void arrayEle(int a[],int size)
    {
      System.out.println("Elements in an array is:");
      for(int i=0;i<size;i++)
        {
          System.out.println(a[i]);
        }
    } 
    public void evenEle(int a[],int size)
    {
      System.out.println("Even elements are");
      for(int i=0;i<size;i++)
        {
          if(a[i]%2==0)
          {
            System.out.println(a[i]);
          }
        }
    }
    public static void main(String args[])
    {
      EvenArray e=new EvenArray();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the size of an array");
      int size=sc.nextInt();
      int a[]=new int[size];
      System.out.println("Enter the elements in an array");
      for(int i=0;i<size;i++)
        {
          a[i]=sc.nextInt();
        }
      e.arrayEle(a,size);
      e.evenEle(a,size);
    }
  }