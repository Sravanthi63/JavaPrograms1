import java.util.Scanner;
class Currency
  {
    public static void main(String args[])
    {
      Scanner sc=new Scanner(System.in);
      int totalnotes=0;
      System.out.println("Enter amount");
      int amt=sc.nextInt();
      if(amt%100==0)
      {
        if(amt>1000)
        {
          int thn=amt/1000;
          amt=amt%1000;
          totalnotes=totalnotes+thn;
        }
        if(amt<1000&&amt>=500)
        {
          int fhn=amt/500;
          amt=amt%500;
          totalnotes=totalnotes+fhn;
        }
        if(amt<500&&amt>=100)
        {
          int hn=amt/100;
          amt=amt%100;
          totalnotes=totalnotes+hn;
        }
      
      System.out.println("The minimum notes are:"+totalnotes);
      }
      else
      {
        System.out.println("Enter the amount of multiple of 100");
      }
    }
  }