import java.util.Scanner;
class EqualOrNot
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the value a: ");
      int a=sc.nextInt();
      System.out.println("enter the value b: ");
      int b=sc.nextInt();
      if(a==b)
      {
        System.out.println("the value is equal");
      }
     else
      {
      System.out.println("the value is not equal");  
}
    }
  }
