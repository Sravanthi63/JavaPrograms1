import java.util.Scanner;
class PosOrNeg
  {
    public static void main(String args[])
    {
     
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the number");
      int num=sc.nextInt();
      if(num>=0)
      {
        System.out.println("the number is positive:"+num);
      }
      else if(num<0)
      {
        System.out.println("the number is negative"+num);
      }
       else
      {
        System.out.println("the number is zero:"+num);
}
      }
  }